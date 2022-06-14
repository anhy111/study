package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		
		//초기값
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int target = random.nextInt(100) + 1;
		int input = 0;
		while(true) {
			System.out.print("1부터 100사이의 정수 중 하나를 선택하세요: ");
			input = scanner.nextInt();
			
			if(target == input) {
				System.out.println("정답입니다.");
				break;
			} else if(target < input) {
				System.out.println("정답은 더 작은 수입니다.");
			} else {
				System.out.println("정답은 더 큰 수입니다.");
			}
		}
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}
