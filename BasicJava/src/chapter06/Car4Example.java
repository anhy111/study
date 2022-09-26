package chapter06;

public class Car4Example {
	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.keyTrunOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도:" + speed + "km/h");
	}
}
