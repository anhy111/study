package chapter13;

public class ValueExample {
	public static void main(String[] args) {
		/*
		 * Generic(제네릭, 지네릭)
		 * JDK 1.5부터 도입
		 * 표현 방법: <>를 이용
		 * 데이터 타입을 나중에 결정
		 * */
		Value value3 = new Value(10);
		if(value3.getValue() instanceof Integer) {
			int value4 = (int) value3.getValue();			
		}
		Value value5 = new Value("10");
		System.out.println(value5.getValue());
		
		Box<Integer> box = new Box<Integer>(100);
		box.setValue(100);
		int integer = box.getValue();
		
	}
}
