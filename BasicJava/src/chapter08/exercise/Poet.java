package chapter08.exercise;

public class Poet extends Book {
	//필드
	//생성자
	public Poet(String title, String auther) {
		super(title, auther);
	}
	
	//메소드
	@Override
	public int getLastFee(int lastDays) {
		return 200 * lastDays;
	}
}
