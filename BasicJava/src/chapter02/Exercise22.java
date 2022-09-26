package chapter02;

public class Exercise22 {

	public static void main(String[] args) {
		
		//선언 및 할당
		double distance = 40e12;
		long speed = (long)300000*60*60*24*365;	//연산시 int로 자동변환되어 범위초과가 발생하므로 long으로 강제캐스팅
		
		//처리 및 출력
		double time = distance / speed;
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %.15f광년이다.", time);
		
	}

}
