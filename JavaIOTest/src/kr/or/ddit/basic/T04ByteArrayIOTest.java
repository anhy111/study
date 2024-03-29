package kr.or.ddit.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class T04ByteArrayIOTest {
	public static void main(String[] args) throws IOException {
		
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];	// 데이터를 읽을 때 사용할 배열
		
		
		// 스트림 객체 생성하기
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		
		ByteArrayOutputStream baos = 
						new ByteArrayOutputStream();
		
		int len = 0;	// 버퍼로 읽어드린 byte 수
		
		while((len = bais.read(temp)) != -1) {
			System.out.println("temp => " + Arrays.toString(temp));
			baos.write(temp, 0, len);	//출력하기
			System.out.println("while문 내부 len=> "+len);
		}
		System.out.println("while문 후 len=> " + len);
		// 출력된 스트림 값들을 배열로 변환해서 반환하는 메서드
		outSrc = baos.toByteArray();
		
		System.out.println("inSrc => " + Arrays.toString(inSrc));
		System.out.println("outSrc => " + Arrays.toString(outSrc));
		
		
		
	}
}
