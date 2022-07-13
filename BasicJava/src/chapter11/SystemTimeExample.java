package chapter11;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			for(int j=0; j<=1000000; j++) {
				sum += i;
			}
		}
		
		long time2 = System.currentTimeMillis();
		System.out.println("1~1000000까지의 합 " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 밀리초가 소요되었습니다.");
	}
}
