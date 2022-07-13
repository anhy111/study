package chapter01;

public class Gugudan {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		while(i <= 9) {
			j = 1;
			System.out.println(i + "단 돌격");
			while(j <= 9) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			i++;
		}
	}
}
