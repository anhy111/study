package jungsuk04;

import java.util.Random;
import java.util.Scanner;

public class Control4_14 {
	public static void main(String[] args) {
		int answer = new Random().nextInt(100)+1;
		int input = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = scanner.nextInt();
			
			if(input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
		}while(true);
	}
}
