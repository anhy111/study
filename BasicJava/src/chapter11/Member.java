package chapter11;

import java.util.Objects;

// Data Object(데이터를 저장하는 객체)
// Value Object
// 
public class Member {
	//필드
	private String id;
	private String name;
	private int mileage;
	
	//생성자
	public Member(String id, String name, int mileage) {
		super();
		this.id = id;
		this.name = name;
		this.mileage = mileage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(!(obj instanceof Member)) {	//중첩 if문을 안쓰기 위해 not을 사용
//			return false;
//		}
//		Member member = (Member)obj;
//		
//		if(this.id.equals(member.id) 
//				&& (this.name.equals(member.name))) {
//			return true;
//		}
//		return false;
//	}
}
