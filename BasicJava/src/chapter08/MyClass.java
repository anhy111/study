package chapter08;

public class MyClass {
	RemoteControl control;
	public MyClass() {
		control = new Television();
	}
	public MyClass(RemoteControl control) {
		this.control = control;
		control.turnOn();
		control.setVolume(5);
	}
	
	void mothodA() {
		RemoteControl control = new Audio();
		control.turnOn();
		control.setVolume(5);
	}
	
	void methodB() {
		control.turnOn();
		control.setVolume(5);
	}
}
