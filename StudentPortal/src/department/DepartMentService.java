package department;

import java.util.List;

public class DepartMentService {
	//필드
	private static DepartMentService studentService = new DepartMentService();
	private DepartMentDAO studentDAO = DepartMentDAO.getInstance();
	
	//생성자
	private DepartMentService() {}
	
	//메소드
	public static DepartMentService getInstance() {
		return studentService;
	}
	
	public List<DepartMentVO> selectStudent() {
		
		try {
			return studentDAO.selectStudent();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int insertStudent(DepartMentVO vo) {
		try {
			return studentDAO.insertStudent(vo);
		} catch (Exception e) {
			return 0;
		}
	}
	
	
	
}
