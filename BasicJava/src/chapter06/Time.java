package chapter06;

public class Time {
	
	//필드
	private int hour;
	private int minute;
	private int second;
	
	
	//생성자
	public Time() {
		
	}
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	
	//메소드
	void setHour(int hour) {
		if( 0 <= hour && hour <= 23) {
			this.hour = hour;
		}
	}
	int getHour() {
		return hour;
	}
	
	
	void setMinute(int minute) {
		if( 0 <= minute && minute <= 59) {
			this.minute = minute;
		}
	}
	int getMinute() {
		return minute;
	}
	
	
	void setSecond(int second) {
		if( 0 <= second && second <= 59) {
			this.second = second;
		}
	}
	int getSecond() {
		return second;
	}
	
	//인스턴스의 필드가 어떤 값을 갖고 있는지 확인할 수 있는 메소드
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
