package chapter06;

public class Printer {
	
	//필드
	static int abbc =0;
	//생성자
	
	//메소드
	void println(String message) {
		System.out.println(message);
	}
	void println(int message) {
		System.out.println(message);
	}
	void println(boolean message) {
		System.out.println(message);
	}
	void println(double message) {
		System.out.println(message);
	}
	static void println(char message) {
		System.out.println(message);
	}
	
	static void print() {
		println('c');
	}
}
