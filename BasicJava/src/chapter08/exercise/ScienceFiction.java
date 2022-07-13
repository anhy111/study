package chapter08.exercise;

public class ScienceFiction extends Book {
	//필드
	//생성자
	public ScienceFiction(String title, String auther) {
		super(title, auther);
	}
	
	//메소드
	@Override
	public int getLastFee(int lastDays) {
		return 600 * lastDays;
	}
}
