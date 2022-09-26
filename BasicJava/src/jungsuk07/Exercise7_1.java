package jungsuk07;

import java.util.Random;

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	public SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	
	public void shuffle() {
		Random random = new Random();
		for(int i=0; i<cards.length; i++) {
			int temp = random.nextInt(20);
			
			SutdaCard sc = cards[i];
			cards[i] = cards[temp];
			cards[temp] = sc;
		}
		
	}
	
	public SutdaCard pick(int index) {
		if( index < 0 || CARD_NUM <= index){
			return null;
		}
		return cards[index];
	}
	
	public SutdaCard pick() {
		return pick(new Random().nextInt(20));
	}
}

class SutdaCard{
	final int num;
	final boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//info()대신 object클래스의 toString()을 오버라이딩함.
	@Override
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}