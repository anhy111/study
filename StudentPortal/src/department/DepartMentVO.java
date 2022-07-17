package department;

import java.util.ArrayList;
import java.util.List;

public class DepartMentVO {
	//필드
	private String depNo;
	private String depNm;
	private String depPne;
	
	//생성자
	public DepartMentVO() {}
	public DepartMentVO(String depNo) {
		this.depNo = depNo;
	}
	public DepartMentVO(String depNo, String depNm, String depPne) {
		this.depNo = depNo;
		this.depNm = depNm;
		this.depPne = depPne;
	}

	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}

	public String getDepNm() {
		return depNm;
	}

	public void setDepNm(String depNm) {
		this.depNm = depNm;
	}

	public String getDepPne() {
		return depPne;
	}

	public void setDepPne(String depPne) {
		this.depPne = depPne;
	}
	public List<String> getUpdateInfo() {
		List<String> list = new ArrayList<>();
		list.add(depNm);
		list.add(depPne);
		return list;
	}
	
	
}
