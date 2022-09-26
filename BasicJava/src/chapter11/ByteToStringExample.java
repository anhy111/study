package chapter11;

public class ByteToStringExample {
	public static void main(String[] args) {
//		//사용자
//		// plain text
//		String txt = "한글";
//		// 암호화알고리즘으로 암호화
//		String secureTxt = "asdfasdf";
//		
//		//byte 배열로 변환 ( 네트워크에 유리한 데이터 타입 )
//		byte[] secureBytes = secureTxt.getBytes();
//		
//		//서버
//		
//		//받은데이터를 복호화
//		byte[] bytes = secureBytes;
//		
//		// 바이트 배열을 문자열로 변환
//		String receivedTxt = new String(bytes);
//		
//		System.out.println(receivedTxt);
//		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
									// 시작인덱스, 가져올 개수
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}
