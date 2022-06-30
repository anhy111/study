package jungsuk07.shape;

public abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape{
	double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return width == height && width*height != 0;
	}
}