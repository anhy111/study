package chapter06;


public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		// static이 붙은 메소드나 함수는 
		// 클래스가 정보를 갖고 있으므로
		// 객체를 생성할 필요가 없다.
		Printer.println('A');
		
		
	}
}
