package chapter06;

public class NewCar {
	
	//필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0 / 1.6;
	
	
	//생성자
	public NewCar() {

	}
	public NewCar(String color) {
		this.color = color;
	}
	
	
	//메소드
	public void setSpeed(double speed) {
		if(0 <= speed ) {
			this.speed = killoToMile(speed);
		}
	}
	public double getSpeed() {
		return mileToKillo(speed);
	}
	
	
	public void setcolor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	public boolean speedUp(double speed) {
		if( 0 <= this.speed + killoToMile(speed)
				&& this.speed + killoToMile(speed) <= MAX_SPEED) {
			this.speed += killoToMile(speed);
			return true;
		}
		return false;
	}
	
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	public static double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	public static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	
	public String toString() {
		return String.format("차의 최대 속력: %.1f\n현재 차의 속력: %f", MAX_SPEED,speed);
	}
}
