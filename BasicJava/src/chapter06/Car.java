package chapter06;

public class Car {
	//필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	
	//생성자
	public Car() {

	}
	public Car(String color) {
		this.color = color;
	}
	
	
	//메소드
	public void setSpeed(double speed) {
		if(0 <= speed ) {
			this.speed = speed;
		}
	}
	public double getSpeed() {
		return speed;
	}
	
	
	public void setcolor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	public boolean speedUp(double speed) {
		if( 0 <= this.speed + speed
				&& this.speed + speed <= MAX_SPEED) {
			setSpeed(this.speed + speed);
			return true;
		}
		return false;
	}
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	public String toString() {
		return String.format("차의 최대 속력: %.1f\n현재 차의 속력: %f", MAX_SPEED,speed);
	}
}
