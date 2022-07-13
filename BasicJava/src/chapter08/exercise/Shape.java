package chapter08.exercise;

public abstract class Shape implements Comparable<Shape> {
	
	//필드
	//생성자
	//메소드
	public abstract double area();
	public abstract double perimeter();
	
	@Override
	public int compareTo(Shape o) {
		if(area() < o.area()) {
			return -1;
		}else if(area() > o.area()) {
			return 1;
		}
		return 0;
	}
}
