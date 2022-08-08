package mvc.member;

import java.util.List;


public class MemberServiceImpl implements IMemberService {

	@Override
	public int registerMember(MemberVO mv) {
		return 0;
	}

	@Override
	public boolean checkMember(String memId) {
		return false;
	}

	@Override
	public int modifyMember(MemberVO mv) {
		return 0;
	}

	@Override
	public int removeMember(String memId) {
		return 0;
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		return null;
	}
	
}
