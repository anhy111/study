package chapter04;

import java.util.Random;

public class VerificationProblem3 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int sum = 0;
		while(true) {
			int firstNum = random.nextInt(6) + 1;
			int secondNum = random.nextInt(6) + 1;
			System.out.printf("(%d, %d)\n",firstNum,secondNum);
			sum = firstNum + secondNum;
			if (sum == 5) {
				break;
			}
		}
	}
}

