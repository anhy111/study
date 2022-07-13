package jungsuk04;

import java.util.Random;

public class Control4_6 {
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int j=0; j<=6; j++) {
				if(i + j == 6) {
					System.out.println("i = " + i + ",j = " + j);
				}
			}
		}
	}
}
