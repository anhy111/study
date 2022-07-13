package jungsuk07;

public class Exercise7_19 {
	public static void main(String args[])   {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	} 
}
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) { 
		if(this.money < p.price) {
			System.out.printf("잔액이 부족하여 " + p + "을/를 살수 없습니다.\n");
			return;
		}
		this.money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(i >= this.cart.length) {
			Product[] newCart = new Product[this.cart.length * 2];
			for(int j=0; j<this.cart.length; j++) {
				newCart[j] = this.cart[j];
			}
			this.cart = newCart;
		}
		cart[i++] = p;
	}
	
	void summary() {
		int useMoney = 0;
		String itemList = "";
		for(int j=0; j<this.i; j++) {
			itemList += cart[j]+",";
			useMoney += cart[j].price;
		}
		System.out.println("구입한 물건:" + itemList);
		System.out.println("사용한 금액:" + useMoney);
		System.out.println("남은 금액:" + this.money);
	}
}

class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv() { super(100); }

	@Override
	public String toString() { return "Tv";	}

}

class Computer extends Product{
	Computer() { super(200); }
	
	@Override
	public String toString() { return "Computer"; }
	
}

class Audio extends Product{
	Audio() { super(50); }
	
	@Override
	public String toString() { return "Audio"; }
}














