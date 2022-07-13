package chapter08;

public class OracleDao implements DataAccessObject	{
	@Override
	public void delete() {
		System.out.println("Oracle db에서 삭제");
		
	}@Override
	public void insert() {
		System.out.println("Oracle db에 삽입");
		
	}@Override
	public void select() {
		System.out.println("Oracle db에서 검색");
		
	}@Override
	public void update() {
		System.out.println("Oracle db를 수정");
		
	}
}
