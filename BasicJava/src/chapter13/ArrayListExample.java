package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		for(String string : list) {
			System.out.println(string);
		}
		System.out.println();
		list.add(2,"DataBase");	//2번쨰에 있던 Servlet.99가 3번째로 밀림
		list.add("myBatis");
		for(int i=0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		String skill = list.get(1);
		System.out.println(skill);
		
		list.remove("myBatis");
		
		System.out.println();
		for(int i=0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		list.clear();
		System.out.println(list.size());
	}
}
