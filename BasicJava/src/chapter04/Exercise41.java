package chapter04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		
		//입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int firstSide = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int secondSide = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int thirdSide = scanner.nextInt();
		
		//처리
		String result = null;
		
		if(firstSide < secondSide+thirdSide || secondSide < firstSide+thirdSide ||
						thirdSide < firstSide + secondSide) {
			result = "삼각형을 만들 수 있습니다.";
			} else {
				result = "삼각형을 만들 수 없습니다.";
			}
//		int bigNum, smallNum1, smallNum2;
//		bigNum = ((firstSide + secondSide) + Math.abs(firstSide - secondSide)) / 2;
//		smallNum1 = ((firstSide + secondSide) - Math.abs(firstSide - secondSide)) / 2;
//		
//		if(bigNum < thirdSide) {
//			smallNum2 = bigNum;
//			bigNum = thirdSide;
//		} else {
//			smallNum2 = thirdSide;
//		}
//		
//		if( (bigNum - (smallNum1+smallNum2) ) < 0){
//			result = "삼각형을 만들 수 있습니다.";
//		} else {
//			result = "삼각형을 만들 수 없습니다.";
//		}
		
		//출력
		System.out.println(result);
		
		scanner.close();
	}
}
