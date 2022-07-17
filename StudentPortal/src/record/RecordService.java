package record;

import java.util.List;

import sign.SignVO;

public class RecordService {
	private static RecordService rcService = new RecordService();
	private RecordDAO recordDAO = RecordDAO.getInstance();

	private RecordService() {
	}

	public static RecordService getInstance() {
		return rcService;
	}

	public List<RecordVO> selectSub(SignVO vo) {	//강의목록
		try {
			return recordDAO.selectSub(vo);
		} catch (Exception e) {
//			e.printStackTrace();
			return null;
		}
	}

	public List<RecordVO> selectStu(String lecNo) {	// 학생목록(수강번호)
		try {
			return recordDAO.selectStu(lecNo);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateRc(RecordVO vo) {
		
		try {
			return recordDAO.updateRc(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<RecordVO> rcStudentSelect(SignVO session) {	
		try {
			return recordDAO.rcStudentSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int insertRecord(String audNo) {
		try {
			return recordDAO.insertRecord(audNo);
		} catch(Exception e) {
			return 0;
		}
	}

}
