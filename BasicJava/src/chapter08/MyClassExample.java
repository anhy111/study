package chapter08;

public class MyClassExample {
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		class1.control.turnOn();
		class1.control.setVolume(5);
		
		MyClass class2 = new MyClass(new Audio());
		
		MyClass class3 = new MyClass();
		class3.mothodA();
		
		MyClass class4 = new MyClass();
		class4.methodB();
	}
}
