package chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		
		//처리
		String result = null;
		if( (month > 12) || (month < 1) ) {
			
			result = "잘못된 입력";
		} else if(month <= 2) {
			result = "겨울";
		} else if(month <= 5) {
			result = "봄";
		} else if(month <= 8) {
			result = "여름";
		} else if(month <= 11){
			result = "가을";
		} else {
			result = "겨울";
		}
		
		//출력
		System.out.printf("%d월은 %s입니다.",month, result);
		
		scanner.close();
	}
}
