package chapter01;

public class Loop01 {
	public static void main(String[] args) {
		int[] scores = {85, 90, 70, 75, 100, 95, 95, 80, 75, 85};
		double avg = 0;
		int count = 0;
		while (count <scores.length) {
			avg += scores[count];
			count++;
		}
		avg = avg/scores.length;
		System.out.printf("%.2f",avg);
	}
}