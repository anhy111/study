package subject;

import java.util.List;

import Professor.ProfessorVO;

public class SubjectService {
	private static SubjectService subService = new SubjectService();
	private SubjectDAO subDAO = SubjectDAO.getInstance();
	
	private SubjectService() {}
	
	public static SubjectService getInstance() {
		return subService;
	}
	
	public List<SubjectVO> selectSub() {
		try {
			return subDAO.selectSub();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int insertSub(SubjectVO vo)   {
		try {
			return subDAO.insertSub(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int updateSub( SubjectVO vo) {
		try {
			return subDAO.updateSub(vo);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
