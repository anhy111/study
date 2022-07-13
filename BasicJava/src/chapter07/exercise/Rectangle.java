package chapter07.exercise;

public class Rectangle extends Shape {
	
	//필드
	private double width;
	private double height;
	
	
	//생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	//메소드
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "사각형, 둘레:" + perimeter()
				+ "cm, 넓이: " + area() + "㎠";
	}
}
