package chapter08.exercise;

public class Novel extends Book {
	//필드
	//생성자
	public Novel(String title, String auther) {
		super(title, auther);
	}
	
	//메소드
	@Override
	public int getLastFee(int lastDays) {
		return 300 * lastDays;
	}
}
