package rc;

public class RcVO {
	private String stuNm;//학생이름
	private String audNo;//수강번호
	private String sc;//점수
	private String mk;//평점
	private String rk;//등급
	 
	public RcVO(String audNo, String sc, String mk, String rk) {
		super();
		this.audNo = audNo;
		this.sc = sc;
		this.mk = mk;
		this.rk = rk;
	}
	public RcVO(String stuNm, String audNo, String sc, String mk, String rk) {
		super();
		this.stuNm = stuNm;
		this.audNo = audNo;
		this.sc = sc;
		this.mk = mk;
		this.rk = rk;
	}
	public String getStuNm() {
		return stuNm;
	}
	public void setStuNm(String stuNm) {
		this.stuNm = stuNm;
	}
	public String getAudNo() {
		return audNo;
	}
	public void setAudNo(String audNo) {
		this.audNo = audNo;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	public String getRk() {
		return rk;
	}
	public void setRk(String rk) {
		this.rk = rk;
	}
	
	public String allToString() {
		return String.format("%s \t %s \t %s \t %s \t %s", stuNm, audNo, sc, mk, rk);
	}
	
	public String recordToString() {
		return String.format("%s \t %s \t %s \t %s", audNo, sc, mk, rk);
	}
	
	
	
	

}
