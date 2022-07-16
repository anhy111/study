package room;

import java.util.List;

public class RoomService {
	//필드
	private static RoomService studentService = new RoomService();
	private RoomDAO studentDAO = RoomDAO.getInstance();
	
	//생성자
	private RoomService() {}
	
	//메소드
	public static RoomService getInstance() {
		return studentService;
	}
	
	public List<RoomVO> selectStudent() {
		
		try {
			return studentDAO.selectStudent();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int insertStudent(RoomVO vo) {
		try {
			return studentDAO.insertStudent(vo);
		} catch (Exception e) {
			return 0;
		}
	}
	
	
	
}
