package chapter20.memo;

import java.sql.SQLException;
import java.util.List;

public class MemoController {
	MemoService service = new MemoService();

	public List<MemoVO> getmemos() throws Exception {
		return service.selectList();
	}
	
	public MemoVO getMemo(int searchId) throws SQLException {
		return service.selectOne(searchId);
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return service.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return service.updateMemo(vo);
	}
	
	public int deleteMemo(int deleteId) throws Exception {
		return service.deleteMemo(deleteId);
	}
}
