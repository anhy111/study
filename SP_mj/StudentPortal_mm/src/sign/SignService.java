package sign;

import common.LoginMenu;
import main.Main;

public class SignService {
	//필드
	private static SignService signService = new SignService();
	private SignDAO signDAO = SignDAO.getInstance();
	//생성자
	private SignService() {}
	
	//메소드
	public static SignService getInstance() {
		return signService;
	}
	

	public int studentSign(SignVO vo) {
		return signDAO.studentSign(vo);
	}

	public int professorSign(SignVO vo) {
		return signDAO.professorSign(vo);
	}
	
}
