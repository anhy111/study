package chapter10.Exercise;

import java.util.Scanner;

public class Exercise11 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("어떤 수로 나누시겠습니까?>> ");
				String operand1 = scanner.nextLine();
				int op1 = Integer.parseInt(operand1);
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				String operand2 = scanner.nextLine();
				int op2 = Integer.parseInt(operand2);
				System.out.println(op1 + "/" + op2 + "=" + op1/op2);
				break;
			} catch(ArithmeticException e) {
				System.out.print("0으로 나눌 수 없습니다.");
			} catch(NumberFormatException e) {
				System.out.print("잘못된 입력입니다.");
			}
			System.out.println(" 다시 입력해주세요.");
			
		}
		scanner.close();
	}
}
