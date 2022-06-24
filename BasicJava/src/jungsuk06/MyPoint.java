package jungsuk06;

public class MyPoint {
	
	//필드
	int x;
	int y;
	
	
	//생성자
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//메서드
	double getDistance(int x, int y) {
		int base = x - this.x;
		int height = y - this.y;
		return Math.sqrt((base*base) + (height*height));
	}
}
