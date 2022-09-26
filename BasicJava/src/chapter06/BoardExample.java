package chapter06;

public class BoardExample {
	public static void main(String[] args) {
		
		Board board1 = new Board("타이틀","컨텐츠");
		Board board2 = new Board("타이틀","컨텐츠","로그인한 회원아이디");
		Board board3 = new Board("타이틀","컨텐츠","로그인한 회원아이디", "현재 컴퓨터 날짜");		
		Board board4 = new Board("타이틀","컨텐츠","로그인한 회원아이디", "현재 컴퓨터 날짜",0);
		
		Board[] board5 = new Board[5];
	}
}
