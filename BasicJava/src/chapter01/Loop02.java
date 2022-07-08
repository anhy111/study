package chapter01;

public class Loop02 {
	public static void main(String[] args) {
		//과목 : kor, eng
		//while문을 사용하여 다음과 같이 출력해보자.
		//kor의 평균 : 90
		//eng의 평균 : 90
		int[][] scores = {
				{90,80},
				{95,75},
				{100,90},
				{95,85},
				{80,100}
		};
		
		int count1 = 0;
		double korAvg = 0;
		double engAvg = 0;
		while(count1 < scores.length) {
			int count2 = 0;
			while(count2 < scores[count1].length) {
				if(count2 == 0) {
					korAvg += scores[count1][count2]; 
				} else {
					engAvg += scores[count1][count2];
				}
				count2++;
			}
			count1++;
		}
		System.out.println("kor의 평균 : " + korAvg/count1);
		System.out.println("eng의 평균 : " + engAvg/count1);
	}
	
}
	