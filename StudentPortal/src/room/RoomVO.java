package room;

public class RoomVO {
	//필드
	private String rmNo;
	private String rmNm;
	
	//생성자
	public RoomVO() {}

	public RoomVO(String rmNo, String rmNm) {
		this.rmNo = rmNo;
		this.rmNm = rmNm;
	}

	public String getRmNo() {
		return rmNo;
	}

	public void setRmNo(String rmNo) {
		this.rmNo = rmNo;
	}

	public String getRmNm() {
		return rmNm;
	}

	public void setRmNm(String rmNm) {
		this.rmNm = rmNm;
	}

	@Override
	public String toString() {
		return String.format("RoomVO [rmNo=%s, rmNm=%s]", rmNo, rmNm);
	}
	
	
	
}
