package chapter08.exercise;

public class ScienceFiction extends Book {
	//필드
	//생성자
	public ScienceFiction(String title, String auther) {
		super(title, auther);
	}
	@Override
	public int getLastFee(int lastDays) {
		return 600 * lastDays;
	}
	@Override
	public String toString() {
		return String.format("관리번호 %d번, %s(일주일 연체료: %,d원)",getNumber()+1,super.toString(),getLastFee(7));
	}
}
