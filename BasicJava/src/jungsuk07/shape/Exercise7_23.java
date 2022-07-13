package jungsuk07.shape;

public class Exercise7_23 {
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}
	
	static double sumArea(Shape[] arr) {
		double result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i].calcArea();
		}
		return result;
	}
}
