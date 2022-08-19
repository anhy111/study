package kr.or.ddit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClient {
	
	private DatagramSocket ds;
	private DatagramPacket dp;
	
	private byte[] msg;		// 데이터가 저장될 공간으로 byte배열을 생성함
	
	public UdpClient() {
		msg = new byte[100];
		
		try {
			
			// 포트번호 생략시 임의의 포트번호 할당
			ds = new DatagramSocket();
			
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		
		try {
			
			InetAddress serverAddr = InetAddress.getByName("192.168.142.3");
			
			dp = new DatagramPacket(msg, 1, serverAddr, 8888);
			ds.send(dp);	// 패킷 전송
			
			dp = new DatagramPacket(msg, msg.length);
			ds.receive(dp);		// 패킷 수신
			
			System.out.println("현재 서버 시간 => " 
							+ new String(dp.getData()));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public static void main(String[] args) {
		new UdpClient().start();
	}
	
	
}
