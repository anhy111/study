package chapter08.exercise;

public abstract class Book {
	//필드
	private int number;
	private String title;
	private String auther;
	private static int countOfBooks;
	
	//생성자
	public Book(String title, String auther) {
		this.title = title;
		this.auther = auther;
		this.number = ++countOfBooks;
	}

	//메소드
	public abstract int getLastFee(int lastDays);
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( (obj instanceof Book) &&  this.hashCode() != obj.hashCode() ) {
			Book book = (Book)obj;
		
			if(this.title.equals(book.title) 
					&& this.auther.equals(book.auther)) {
				return true;
			}
		} 
		return false;
	}
	
	@Override
	public String toString() {
		return  String.format("관리번호 %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)",
				this.number,this.title, this.auther,getLastFee(7));
	}
}
