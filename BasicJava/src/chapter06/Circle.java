package chapter06;

public class Circle {
	
	//필드
	double radius;
	double x;
	double y;
	
	
	//생성자
	
	
	//메소드
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	public void setRadius(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}
	}
	public double getRadius() {
		return radius;
	}
	
	
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return x;
	}
	
	
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return y;
	}
	
}
