package thread.exercise;

import java.util.List;

public class HorseExample {
	public static void main(String[] args) {
		new HorseRacing().start();
	}
	
	
}

class HorseRacing extends Thread{
	private List<Horse> horses;
	
	public HorseRacing() {
		horses.add(new Horse("바둑이"));
		horses.add(new Horse("흰둥이"));
		horses.add(new Horse("뚝배기"));
		horses.add(new Horse("자바"));
		horses.add(new Horse("오라클"));
		horses.add(new Horse("아메리카노"));
		horses.add(new Horse("스크립트"));
		horses.add(new Horse("쓰레드"));
		horses.add(new Horse("프로세스"));
		horses.add(new Horse("말"));
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}