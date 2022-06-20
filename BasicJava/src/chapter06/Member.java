package chapter06;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	// 생성자는 하나이상 명시적으로 선언 가능
	// 사용할 생성자의 구분은 매개인자의 데이터 타입, 개수로 구분 ( 생성자 오버로딩 )
	// Default Constructor(기본 생성자)
	Member(){
		
	}
	
	// 매개값(매개변수)이 있는 생성자
	// this : 메모리에 위치한 객체 자신을 가리킨다.
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Member(String id, String password){
		this.id = id;
		this.password = password;
	}
	
}
