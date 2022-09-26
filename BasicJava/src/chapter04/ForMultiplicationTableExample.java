package chapter04;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int i=1; i<10; i++) {
				System.out.println(m + " * " + i + " = " + m*i);
			}
		}
	}
}
