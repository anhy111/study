package chapter05;

import java.util.Random;

public class Assignment4 {
	public static void main(String[] args) {
		
		//선언 및 생성
		Random random = new Random();
		int[] count = new int[6];
		
		//처리
		for(int i=0; i<10000; i++) {
			switch(random.nextInt(6)) {
			case 0:
				count[0]++;
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			}
		}
		
		//출력
		System.out.println("------------");
		System.out.printf("%-6s%5s\n","면","빈도");
		System.out.println("------------");
		for(int i=0; i<count.length; i++) {
			System.out.printf("%-6d%6d\n",i+1,count[i]);
		}
	}
}
