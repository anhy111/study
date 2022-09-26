package kr.or.ddit.basic.http;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.StringTokenizer;


/**
 * 간단한 웹서버 예제
 * @author PC-18
 *
 */
public class MyHttpServer {
	private final int port = 80;
	private final String encoding = "UTF-8";
	
	// http 서버 시작
	public void start() {
		
		System.out.println("HTTP 서버가 시작되었습니다.");
		
		try(ServerSocket server = new ServerSocket(this.port)) {
			
			while(true) {
				try {
					Socket socket = server.accept();
					
					HttpHandler handler = new HttpHandler(socket);
					
					new Thread(handler).start();
					
				}catch (IOException e) {
					System.out.println("커넥션 오류!!");
					e.printStackTrace();
				} catch (RuntimeException e) {
					System.out.println("알 수 없는 오류!!");
					e.printStackTrace();
				}
			}
			
			
			
			
			
			
		} catch(IOException ex) {
			System.out.println("서버 시작 오류!");
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * HTTP 요청 처리를 위한 Runnable 구현 클래스
	 */
	private class HttpHandler implements Runnable{
		
		private final Socket socket;
		
		HttpHandler(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			OutputStream out = null;
			BufferedReader br = null;
			
			try {
				
				out = new BufferedOutputStream(
						socket.getOutputStream());
				br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				
				// 요청헤더 정보 파싱하기
				StringBuilder sb = new StringBuilder();
				
				// Request Line
				String reqLine = br.readLine();	// 첫줄은 요청라인..
				
				printMsg("request Line : ", reqLine);
				
				while(true) {
					String str = br.readLine();
					
					if(str.equals("")) break;
					
					sb.append(str + "\n");
					
				}
				
				// 헤더(Header) 정보
				String reqHeaderStr = sb.toString();
				
				printMsg("요청 헤더: ", reqHeaderStr);
				
				String reqPath = "";	// 요청 경로
				
				// 요청 페이지 정보 가져오기
				StringTokenizer st = new StringTokenizer(reqHeaderStr);
				
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					
					if(token.startsWith("/")) {
						reqPath = token;
						
						break;
					}
				}
				
				// URL 디코딩 처리(한글 깨짐 문제 처리용)
				reqPath = URLDecoder.decode(reqPath, encoding);
				
				String filePath = "./WebContent/" + reqPath;
				
				// 해당 파일이름을 이용하여 Content-type 정보 추출하기
				String contentType = URLConnection.getFileNameMap().getContentTypeFor(filePath);
				
				// CSS 파일인 경우 인식이 안되서 추가함.
				if(contentType == null && filePath.endsWith(".css")) {
					contentType = "text/css";
				}
				
				File file = new File(filePath);
				if(file.exists()) {
					makeErrorPage(out, 404, "Not Found");
					return;
				}
				
				byte[] body = makeResponseBody(filePath);
				
				byte[] header = makeResponseHeader(body.length, contentType);
				
				// 요청헤더가 HTTP/1.0이나 그 이후의 버전을 지원할 경우 MIME 헤더를 전송한다.
				if(reqLine.indexOf("HTTP/") != -1) {
					out.write(header);
				}
				
				// 응답내용 보내기 전 반드시 Empty Line을 보낸다.
				out.write("\r\n\r\n".getBytes());
				
				out.write(body);	// 응답 내용 보내기
				
				out.flush();
				
				
			} catch(IOException ex) {
				ex.printStackTrace();
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 * 메시지 출력 메서드
	 * @param title
	 * @param msg
	 */
	private void printMsg(String title, String msg) {
		System.out.println("======================================================");
		System.out.println(title);
		System.out.println("======================================================");
		System.out.println(msg);
		System.out.println("------------------------------------------------------");
	}
	
	/**
	 * 응답 헤더 생성하기
	 * @param contentLength	응답내용 크기
	 * @param mimeType	마임타입
	 * @return
	 */
	private byte[] makeResponseHeader(int contentLength, String mimeType) {
		
		String header = "HTTP/1.1 200 OK\r\n"
				+ "Server: MyHTTPServer 1.0\r\n"
				+ "Content-length: " + contentLength + "\r\n"
				+ "Content-Type: " + mimeType + "; charset=" + this.encoding;
		
		return header.getBytes();
	}
	
	/**
	 * 응답내용 생성하기
	 * @param filePath 응답으로 사용할 파일경로
	 * @return	바이트 배열 데이터
	 */
	private byte[] makeResponseBody(String filePath) {
		FileInputStream fis = null;
		byte[] data = null;
		
		try {
			
			File file = new File(filePath);
			data = new byte[(int)file.length()];
			
			fis = new FileInputStream(file);
			fis.read(data);
			
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return data;
	}
	
	/**
	 * 에러페이지 생성
	 * @param out
	 * @param statusCode
	 * @param errMsg
	 */
	private void makeErrorPage(OutputStream out, int statusCode, String errMsg) {
		
		String statusLine = "HTTP/1.1" + " " + statusCode + " "
				+ errMsg;
		
		
		
		try {
			out.write(statusLine.getBytes());
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyHttpServer().start();
	}
}
