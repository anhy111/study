package department;

import java.util.List;

public class DepartMentController {
	//필드
	private static DepartMentController depController = new DepartMentController();
	private DepartMentService depService = DepartMentService.getInstance();
	
	//생성자
	private DepartMentController() {}
	
	//메소드
	public static DepartMentController getInstance() {
		return depController;
	}
	
	public List<DepartMentVO> selectDepartment() {
		return depService.selectDepartment();
	}
	
	public int insertDepartment(DepartMentVO vo) {
		return depService.insertDepartment(vo);
	}
}
