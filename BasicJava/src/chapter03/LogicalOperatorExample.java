package chapter03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}
		
		if( !(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		
		/* 	&&와 & 연산자의 차이
		 *	&&은 논리연산자, &는 비트연산자
		 *	자바에서는 비트연산자를 취급하지 않는다.
		 *	&& 첫번째 조건만으로 false가 결정나면 뒤에 수식들은 생략한다.
		 *	& 첫번째 조건이 false여도 뒤에 있는 수식들까지 계산한다.
		 * 	or는 반대로 첫번째가 true면 생략
		 */
	}
}
