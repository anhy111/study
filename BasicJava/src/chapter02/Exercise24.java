package chapter02;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		
		//변수의 선언 및 입력
		double radius, height, area, volume;
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm):  ");
		radius = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		height = scanner.nextDouble();
		
		//처리
		area =  radius * radius * Math.PI;
		volume = area * height;
		
		//출력
		System.out.printf("원기둥 밑변의 넓이는 %.15f㎠이고, 원기둥의 부피는 %.15f㎠이다.",area, volume);
		
	}

}
