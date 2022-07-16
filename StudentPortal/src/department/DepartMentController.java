package department;

import java.util.List;

public class DepartMentController {
	//필드
	private static DepartMentController studentController = new DepartMentController();
	private DepartMentService studentService = DepartMentService.getInstance();
	
	//생성자
	private DepartMentController() {}
	
	//메소드
	public static DepartMentController getInstance() {
		return studentController;
	}
	
	public List<DepartMentVO> selectStudent() {
		return studentService.selectStudent();
	}
	
	public int insertStudent(DepartMentVO vo) {
		return studentService.insertStudent(vo);
	}
}
