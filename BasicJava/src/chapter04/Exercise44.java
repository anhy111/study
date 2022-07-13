package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임!");
		System.out.print("철수: ");
		String cheol = scanner.nextLine();
		System.out.print("영희: ");
		String young = scanner.nextLine();
		
		//처리
		String result = null;
		if(cheol.equals(young) ) {
			result = "무승부";
		} else if(cheol.equals("보") && young.equals("바위") ||
				cheol.equals("바위") && young.equals("가위") ||
				cheol.equals("가위") && young.equals("보")) {
			result = "철수 승리!";
		} else {
			result = "영희 승리";
		}
		
		//출력
		System.out.println("결과: " + result);
		
		scanner.close();
	}
}
