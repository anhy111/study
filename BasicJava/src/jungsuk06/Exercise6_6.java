package jungsuk06;

public class Exercise6_6 {
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	//필드
	static double getDistance(int x, int y, int x1, int y1) {
		int base = x1 - x;
		int height = y1 - y;
		return Math.sqrt((base*base) + (height*height));
	}
}
