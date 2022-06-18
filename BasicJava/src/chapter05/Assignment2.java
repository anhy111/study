package chapter05;

import java.util.Random;

public class Assignment2 {
	public static void main(String[] args) {
		
		//선언
		Random random = new Random();
		int[] lotto = new int[6];
		
		// 처리
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(6) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		
		//출력
		System.out.print("로또번호 :");
		for(int num : lotto) {
			System.out.print(" " + num);
		}
	}
}