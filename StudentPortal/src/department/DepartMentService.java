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
	
	public List<DepartMentVO> selectDepartment() {
		
		try {
			return studentDAO.selectDepartment();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int insertDepartment(DepartMentVO vo) {
		try {
			return studentDAO.insertDepartment(vo);
		} catch (Exception e) {
			return 0;
		}
	}
	
	
	
}
