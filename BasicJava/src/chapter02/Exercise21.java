package chapter02;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		
		//변수 선언 및 입력
		double width, height, area, perimeter;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m): ");
		width = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위: m): ");
		height = scanner.nextDouble();
		
		//처리
		area = width * height;
		perimeter = (width + height) * 2;
		
		//출력
		System.out.printf("직사각형의 넓이: %.2f\n", area);
		System.out.printf("직사각형의 둘레: %.1f", perimeter);
		scanner.close();
	}

}
