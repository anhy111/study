package jungsuk06;

import java.util.Random;

public class Exercise6_20 {
	static int[] shuffle(int[] arr) {
		Random random = new Random();
		int randomNum;
		int temp;
		for(int i=0; i < arr.length; i++) {
			randomNum = random.nextInt(9);
			temp = arr[randomNum];
			arr[randomNum] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
