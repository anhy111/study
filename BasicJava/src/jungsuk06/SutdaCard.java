package jungsuk06;

public class SutdaCard {
	
	//필드
	private int num;
	private boolean isKwang;
	
	//생성자
	public SutdaCard() {
		this(1,true);
	}
	public SutdaCard(int num, boolean isKwang) {
		setNum(num);
		setIsKwang(isKwang);
	}
	
	void setNum(int num) {
		if(1 <= num && num <= 10) {
			this.num = num;
			return;
		} 
		this.num = 1;
	}
	int getNum() {
		return num;
	}
	
	
	void setIsKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	boolean getIsKwang() {
		return isKwang;
	}
	
	
	String info() {
		if(getIsKwang()) {
			return getNum() + "k";
		}
		return String.valueOf(getNum());
	}
}
