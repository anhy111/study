package jungsuk04;

public class Control4_3 {
	public static void main(String[] args) {
		
		int sum = 0;
		int totalsum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			totalsum += totalsum + sum;
			System.out.println("sum: " +sum);
			System.out.println("total: " + totalsum);
		}
		
	}
}
