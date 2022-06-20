package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.name = "최하얀";
		member.age  = 23; 
		
		System.out.println("이름: " + member.name);
		System.out.println("나이: " + member.age);
	}
}
