package pocu.shop;

import pocu.bakery.Bakery;
import pocu.bakery.Bread;

public class Main {
	public static void main(String[] args) {
		Bakery bakery = new Bakery();
		Bread bread = new Bread();
		
		// 3
		bakery.addBread(bread);
		
		// 4
//		if (!bread.isFresh()) {
//		    System.out.println("bad bread");
//		}
	}
}
