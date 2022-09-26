package chapter07.exercise;

public class Human {
	//필드
	private String name;
	private int age;
	
	
	//생성자
	public Human() {
		
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//필드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ",나이: "+ age;
	}
}
