package Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorVO {
	//필드
	private String proNo; 		//교수번호
	private String proDep;     //학과번호
	private String proNm;   //교수명
	private String proPneNo;//교수 전화번호
	private String proEm;	//교수 이메일
	private String proBir;	//교수 생년월일
	//생성자
	 
	public ProfessorVO(String proNm, String proEm, String proPneNo, String proDep, String proBir) {
		this.proDep = proNm;
		this.proNm = proEm;
		this.proPneNo = proPneNo;
		this.proEm = proDep;
		this.proBir = proBir;
	}
	

	public ProfessorVO(String proNo, String proNm, String proEm, String proPneNo, String proDep, String proBir) {
		super();
		this.proNo = proNo;
		this.proDep = proDep;
		this.proNm = proNm;
		this.proPneNo = proPneNo;
		this.proEm = proEm;
		this.proBir = proBir;
	}

	public ProfessorVO(String proNo) {
		this.proNo = proNo;
	}

	public ProfessorVO(String proNo, List<String> list) {
		this.proNo = proNo;
		this.proNm = list.get(0);
		this.proEm = list.get(1);
		this.proPneNo = list.get(2);
		this.proDep = list.get(3);
		this.proBir = list.get(4);
		
	}
	//메소드
	public String getProNo() {
		return proNo;
	}
	
	public String getProDep() {
		return proDep;
	}
	
	public String getProNm() {
		return proNm;
	}

	public void setProNm(String proNm) {
		this.proNm = proNm;
	}

	public void setProDep(String proDep) {
		this.proDep = proDep;
	}
	public void setProNo(String proNo) {
		this.proNo = proNo;
	}
	public String getProPneNo() {
		return proPneNo;
	}
	public void setProPneNo(String proPneNo) {
		this.proPneNo = proPneNo;
	}
	public String getProEm() {
		return proEm;
	}
	public void setProEm(String proEm) {
		this.proEm = proEm;
	}
	public String getProBir() {
		return proBir;
	}
	public void setProBir(String proBir) {
		this.proBir = proBir;
	}
	
	
	@Override
	public String toString() {
		return String.format("ProfessorVO [proNo=%s, proDep=%s, proNm=%s, proPneNo=%s, proEm=%s, proBir=%s]", proNo,
				proDep, proNm, proPneNo, proEm, proBir);
	}


	public List<String> getUpdateInfo(){
		List<String> list = new ArrayList<>();
		list.add(proNm);
		list.add(proEm);
		list.add(proPneNo);
		list.add(proDep);
		list.add(proBir);
		
		return list;
	}

}
