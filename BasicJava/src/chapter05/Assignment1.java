package chapter05;

public class Assignment1 {
	public static void main(String[] args) {
		
		//선언
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		//처리
		for(int i=0; i<array.length; i++) {
			if(max< array[i]) {
				max = array[i];
			}
			
			if(min>array[i]) {
				min = array[i];
			}
		}
		
		//출력
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
