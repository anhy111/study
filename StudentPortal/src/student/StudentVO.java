package student;

import java.util.ArrayList;
import java.util.List;

public class StudentVO {
	//필드
	private String stuNo;
	private String stuNm;
	private String stuEm;
	private String stuPneNo;
	private String stuGrd;
	private String stuAcdSt;
	private String stuDep;
	private String stuBir;
	
	//생성자
	public StudentVO() {}
	
	public StudentVO(String stuNo) {
		this.stuNo = stuNo;
	}
	
	public StudentVO(String stuNo, String stuNm, String stuEm, String stuPneNo, String stuGrd, String stuAcdSt,
			String stuDep, String stuBir) {
		this.stuNo = stuNo;
		this.stuNm = stuNm;
		this.stuEm = stuEm;
		this.stuPneNo = stuPneNo;
		this.stuGrd = stuGrd;
		this.stuAcdSt = stuAcdSt;
		this.stuDep = stuDep;
		this.stuBir = stuBir;
	}


	public StudentVO( String stuNm, String stuEm, String stuPneNo, String stuDep, String stuBir) {
		this.stuNm = stuNm;
		this.stuEm = stuEm;
		this.stuPneNo = stuPneNo;
		this.stuDep = stuDep;
		this.stuBir = stuBir;
	}
	
	public StudentVO(String stuNo, List<String> list) {
		this.stuNo = stuNo;
		this.stuNm = list.get(0);
		this.stuEm = list.get(1);
		this.stuPneNo = list.get(2);
		this.stuGrd = list.get(3);
		this.stuAcdSt = list.get(4);
		this.stuDep = list.get(5);
		this.stuBir = list.get(6);
	}

	//메소드
	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuNm() {
		return stuNm;
	}

	public void setStuNm(String stuNm) {
		this.stuNm = stuNm;
	}

	public String getStuDep() {
		return stuDep;
	}

	public void setStuDep(String stuDep) {
		this.stuDep = stuDep;
	}
	
	public String getStuEm() {
		return stuEm;
	}

	public void setStuEm(String stuEm) {
		this.stuEm = stuEm;
	}

	public String getStuPneNo() {
		return stuPneNo;
	}

	public void setStuPneNo(String stuPneNo) {
		this.stuPneNo = stuPneNo;
	}

	public String getStuGrd() {
		return stuGrd;
	}

	public void setStuGrd(String stuGrd) {
		this.stuGrd = stuGrd;
	}

	public String getStuAcdSt() {
		return stuAcdSt;
	}

	public void setStuAcdSt(String stuAcdSt) {
		this.stuAcdSt = stuAcdSt;
	}

	public String getStuBir() {
		return stuBir;
	}

	public void setStuBir(String stuBir) {
		this.stuBir = stuBir;
	}

	@Override
	public String toString() {
		return String.format(
				"%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t", stuNo, stuDep, stuNm, stuEm, stuPneNo, stuGrd, stuAcdSt, stuBir);
	}

	public List<String> getUpdateInfo() {
		List<String> list = new ArrayList<>();
		list.add(stuNm);
		list.add(stuEm);
		list.add(stuPneNo);
		list.add(stuGrd);
		list.add(stuAcdSt);
		list.add(stuDep);
		list.add(stuBir);
		return list;
	}
}
