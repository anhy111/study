package chapter08;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	//compareTo 인터페이스에 정의된 메소드에서 
	// 리턴값 1은 순서변경, -1은 순서그대로, 0은 같다
	@Override
	public int compareTo(Student o) {
		return -this.name.compareTo(o.name);
	};
	
	@Override
	public String toString() {
		return "Student: [name=" + this.name + ", age=" + this.age + "]" ;
	}
	
}
