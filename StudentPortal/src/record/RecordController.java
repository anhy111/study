package record;

import java.util.List;

import main.Main;
import sign.SignVO;

public class RecordController {
	private static SignVO session = Main.getSession();
	private static RecordController rcController = new RecordController();
	private RecordService rcService = RecordService.getInstance();

	private RecordController() {
	}

	public static RecordController getInstance() {
		return rcController;
	}
	
	public List<RecordVO> selectStu(String lecNo) {
		return rcService.selectStu(lecNo);
	}
	public List<RecordVO> selectSub() {
		return rcService.selectSub(session);
	}
	
	public int updateRc(RecordVO vo) {
		return rcService.updateRc(vo);
	}
	
	public List<RecordVO> rcStudentSelect() {
		return rcService.rcStudentSelect(session);
	
}
}
