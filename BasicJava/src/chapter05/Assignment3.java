package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		
		//입력
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String[] array = {"가위", "바위", "보"};
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String human = scanner.nextLine();
		String computer = array[random.nextInt(3)];
		
		//처리
		String result = null;
		if(human.equals(computer) ) {
			result = "무승부!";
		} else if(human.equals("보") && computer.equals("바위") ||
				human.equals("바위") && computer.equals("가위") ||
				human.equals("가위") && computer.equals("보")) {
			result = "게이머 승리!";
		} else {
			result = "컴퓨터 승리!";
		}
		
		//출력
		System.out.println("게이머: " + human);
		System.out.println("인공지능 컴퓨터: " + computer);
		System.out.println(result);
		
		scanner.close();
	}
}
