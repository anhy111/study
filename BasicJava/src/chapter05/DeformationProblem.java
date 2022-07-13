package chapter05;

import java.util.Random;

public class DeformationProblem {
	public static void main(String[] args) {
		
		//선언
		Random random = new Random();
		int range = 45;
		int[] lotto = new int[range];
		
		//처리
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0; i<lotto.length; i++) {
			int ranNum = random.nextInt(range);
			
			int temp = lotto[i];
			lotto[i] = lotto[ranNum];
			lotto[ranNum] = temp;
		}
		
		//출력
		System.out.print("로또번호는:");
		for(int i=0; i<6; i++) {
			System.out.print(" " + lotto[i]);
		}
	}
}
