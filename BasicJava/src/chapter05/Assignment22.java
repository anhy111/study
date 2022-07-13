package chapter05;

import java.util.Random;

public class Assignment22 {
	public static void main(String[] args) {
		
		//객체 및 배열 생성
		Random random = new Random();
		int[] lotto = new int[6];
		
		//처리
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			
			// 처음 배열에 값을 넣었을 때 i=0이므로 for문을 돌지않음.
			// i값을 감소시켜 번호를 다시 뽑음.
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;					
				}
			}
		}
		
		//출력
		System.out.print("로또번호는:");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(" " + lotto[i]);
		}
	}
}
