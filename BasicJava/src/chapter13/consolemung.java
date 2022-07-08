package chapter13;

public class consolemung {
	public static void main(String[] args) throws InterruptedException {
		for(int d=0; d<10000; d++) {
			for(int i=0; i<50*3; i+=3) {
				Thread.sleep(20);
				for(int j=0; j<i;j+=3) {
					System.out.print("***");
				}
				System.out.print("*");
				for(int k=0;k<50-i;k+=3) {
					System.out.print(" ");
				}
				System.out.println();
			}
			for(int i=0; i<50*3; i+=3) {
				Thread.sleep(20);
				for(int j=0; j<150-i;j+=3) {
					System.out.print("***");
				}
				System.out.print("*");
				for(int k=0;k<i;k+=3) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
