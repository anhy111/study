package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int programing = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int dataBase = scanner.nextInt();
		System.out.print("화면 구현: ");
		int view = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int application = scanner.nextInt();
		System.out.print("머신러닝: ");
		int machineLearning = scanner.nextInt();
		
		//처리
		int sum = programing + dataBase + view + application + machineLearning;
		double average = (double)sum / 5;
		char grade = 'F';
		if(average >= 90) {
			grade = 'A';
		} else if(average >= 80) {
			grade = 'B';
		} else if(average >= 70) {
			grade = 'C';
		} else if(average >= 60) {
			grade = 'D';
		}
		
		//출력
		System.out.printf("총점: %d\n",sum);
		System.out.printf("평균: %.2f\n",average);
		System.out.printf("학점: %s\n",grade);
		
		scanner.close();
	}
}
