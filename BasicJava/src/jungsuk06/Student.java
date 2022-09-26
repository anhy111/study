package jungsuk06;

public class Student {
	
	//필드
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	//생성자
	public Student(String name,int ban, int no, int kor, int eng, int math) {
		 this.name = name;
		 this.ban = ban;
		 this.no = no;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
		 
	}	
	
	//메서드
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3f * 10 +0.5f) / 10f; 
	}
	
	String info() {
		return name 
				+ "," + ban 
				+ "," + no 
				+ "," + kor 
				+ "," + eng 
				+ "," + math 
				+ "," + getTotal() 
				+ "," + getAverage()
				;
	}
}
