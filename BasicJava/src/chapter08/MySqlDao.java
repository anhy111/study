package chapter08;

public class MySqlDao implements DataAccessObject{
	@Override
	public void delete() {
		System.out.println("MySql db에서 삭제");
		
	}@Override
	public void insert() {
		System.out.println("MySql db에 삽입");
		
	}@Override
	public void select() {
		System.out.println("MySql db에서 검색");
		
	}@Override
	public void update() {
		System.out.println("MySql db를 수정");
		
	}
}
