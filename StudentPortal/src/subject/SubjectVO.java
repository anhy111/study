package subject;

public class SubjectVO {
	// 필드
	private String subNo;
	private String cre;
	private String subPro;
	private String subRm;
	private String subNm;
	private String comDiv;

	// 생성자
	public SubjectVO(String subNo, String cre, String subPro, String subRm, String subNm, String comDiv) {
		super();
		this.subNo = subNo;
		this.cre = cre;
		this.subPro = subPro;
		this.subRm = subRm;
		this.subNm = subNm;
		this.comDiv = comDiv;
	}

	// 매소드
	public String getSubNo() {
		return subNo;
	}

	public void setSubNo(String subNo) {
		this.subNo = subNo;
	}

	public String getCre() {
		return cre;
	}

	public void setCre(String cre) {
		this.cre = cre;
	}

	public String getSubPro() {
		return subPro;
	}

	public void setSubPro(String subPro) {
		this.subPro = subPro;
	}

	public String getSubRm() {
		return subRm;
	}

	public void setSubRm(String subRm) {
		this.subRm = subRm;
	}

	public String getSubNm() {
		return subNm;
	}

	public void setSubNm(String subNm) {
		this.subNm = subNm;
	}

	public String getComDiv() {
		return comDiv;
	}

	public void setComDiv(String comDiv) {
		this.comDiv = comDiv;
	}

	@Override
	public String toString() {
		return "과목번호: " + subNo + " 학점: " + cre + " 교수번호: " + subPro + " 강의실 번호: " + subRm + " 과목명: " + subNm + " 이수구분: " + comDiv;
	}

}
