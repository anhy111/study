package chapter06;

import chapter06.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; 	// default는 같은 패키지 안에서 접근허용
//		a.field3 = 1; 	// private는 같은 객체안에서 접근 허용
		
		a.method1();
//		a.method2();	// default는 같은 패키지 안에서 접근허용
//		a.method3();	// private는 같은 객체안에서 접근 허용
	}
}
