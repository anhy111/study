package room;

import java.util.List;

public class RoomController {
	//필드
	private static RoomController studentController = new RoomController();
	private RoomService studentService = RoomService.getInstance();
	
	//생성자
	private RoomController() {}
	
	//메소드
	public static RoomController getInstance() {
		return studentController;
	}
	
	public List<RoomVO> selectStudent() {
		return studentService.selectStudent();
	}
	
	public int insertStudent(RoomVO vo) {
		return studentService.insertStudent(vo);
	}
}
