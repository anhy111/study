package chapter13.confirm;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return studentNum == other.studentNum;
	}
	
	
}
