package chapter05;

import java.util.Random;

public class Assignment2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		int overlapCheck = 0;
		
		for(int i=0; i<lotto.length; i++) {
			overlapCheck = random.nextInt(45) + 1;
			if(i== 0) {
				lotto[0] = overlapCheck;
				continue;
			}
			Verification: while(true) {
				for(int j=0; j<i+1; j++) {
					if(lotto[j] == overlapCheck) {
						overlapCheck = random.nextInt(45) + 1;
						break;
					}else if(j == i) {
						break Verification;
					}
				}
			}
			lotto[i] = overlapCheck;
		}
		System.out.print("로또번호 : ");
		for(int num : lotto) {
			System.out.printf("%d "
					,num);
		}
	}
}

