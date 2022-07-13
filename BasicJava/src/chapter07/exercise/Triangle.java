package chapter07.exercise;

public class Triangle extends Shape {
	
	//필드
	private double side;
	
	
	//생성자
	public Triangle(double side) {
		this.side = side;
	}
	
	//메소드
	@Override
	public double area() {
		return Math.sqrt(3)/4*(side*side);
	}
	@Override
	public double perimeter() {
		return side * 3;
	}
	
	@Override
	public String toString() {
		return super.toString() + "삼각형, 둘레:" + perimeter()
		+ "cm, 넓이: " + area() + "㎠";
	}
}
