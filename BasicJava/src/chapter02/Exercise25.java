package chapter02;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		
		//변수 선언 및 입력
		int coin500, coin100, coin50, coin10, result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		coin500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		coin100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		coin50 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		coin10 = scanner.nextInt();
		
		//처리
		result = (coin500 * 500) + (coin100 * 100) + 
					(coin50 * 50) + (coin10 * 10);

		//출력
		System.out.printf("저금통 안의 동전의 총 액수: %d",result);
		
	}

}
