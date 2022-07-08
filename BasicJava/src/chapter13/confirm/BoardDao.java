package chapter13.confirm;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> list;
	
	public BoardDao() {
		this.list = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			list.add(new Board("제목"+i,"내용"+i));
		}
	}
	
	public List<Board> getBoardList(){
		return list;
	}

}
