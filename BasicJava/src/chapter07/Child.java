package chapter07;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super() 컴파일러가 추가해줌
//		첫 줄에 생성자가 온다. 따라서
//		super는 호출되는 최종 생성자의 첫줄에서 호출한다
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
