package chapter03;

import java.util.Scanner;

public class VerificationProblem9 {
	public static void main(String[] args) {
		
		// 입력
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("첫 번째 수: ");
		double firstOperand = Double.parseDouble(scanner.next());
		System.out.print("두 번째 수: ");
		double secondOperand = Double.parseDouble(scanner.next());
		
		//처리
		String result = (secondOperand == 0.0) ? "무한대" : String.valueOf(firstOperand / secondOperand);
		
		//출력
		System.out.println("결과:"+result);
		
	}
}