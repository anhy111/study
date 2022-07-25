package kr.or.ddit.basic;

import java.util.LinkedList;

public class T02StackQueueTest {
	public static void main(String[] args) {
		// Stack => 후입선출(LIFO)구조
		// Queue => 선입선출(FIFO)구조
		
		// Stack과 Queue는 LinkedList를 이용하여 사용할 수 있다.
		LinkedList<String> stack = new LinkedList<>();
		
		/*
		 * stack 명령
		 * 1) 자료입력 : push(저장할 값)
		 * 2) 자료출력 : pop() => 자료를 꺼내온 후 자료를 stack에서 삭제.
		 */
		stack.push("홍길동");
		stack.push("일지매");
		stack.push("변학도");
		stack.push("강감찬");
		System.out.println("현재 stack값들 : " + stack);
		String data = stack.pop();
		System.out.println("꺼내온 자료 : " + data);
		System.out.println("꺼내온 자료 : " + stack.pop());
		System.out.println("현재 stack값들 : " + stack);
		
		stack.push("성춘향");
		System.out.println("현재 stack값들 : " + stack);
		System.out.println("꺼내온 자료 : " + stack.pop());
		System.out.println("=============================================");
		System.out.println();
		
		LinkedList<String> queue = new LinkedList<String>();
		/*
		 * Queue의 명령
		 * 1) 자료 입력 : offer(저장할 값)
		 * 2) 자료 출력 : poll() => 자료를 꺼내온 후 자료를 Queue에서 삭제
		 */
		queue.offer("홍길동");
		queue.offer("일지매");
		queue.offer("변학도");
		queue.offer("강감찬");
		
		System.out.println("현재 queue의 값: " + queue);
		
		String temp = queue.poll();
		System.out.println("꺼내온 자료 : " + temp);
		System.out.println("꺼내온 자료 : " + queue.poll());
		System.out.println("현재 queue의 값 : " + queue);
		
		if(queue.offer("성춘향")) {
			System.out.println("신규 등록 자료 : 성춘향");
		}
		System.out.println("현재 queue의 값 : " + queue);
		System.out.println("꺼내온 자료 : " + queue.poll());
	}
}
