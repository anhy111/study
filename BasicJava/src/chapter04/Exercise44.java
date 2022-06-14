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
			result = "tie";
		} else if(cheol.equals("보") && young.equals("바위")) {
			result = "win";
		} else if(cheol.equals("바위") && young.equals("가위")) {
			result = "win";
		} else if(cheol.equals("가위") && young.equals("보")) {
			result = "win";
		} else {
			result = "lose";
		}
		
		//출력
		switch(result) {
		case "win":
			System.out.println("결과: 철수 승리!");
			break;
		case "tie":
			System.out.println("결과: 무승부!");
			break;
		case "lose":
			System.out.println("결과: 영희 승리!");
			break;
		}
		
		scanner.close();
	}
}
