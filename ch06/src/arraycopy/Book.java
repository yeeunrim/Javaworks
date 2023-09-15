package arraycopy;

public class Book {
	//필드
	private String bookName;
	private String author;
	
	//기본 생성자 : 깊은 복사를 위해 필요
	public Book() {};
	
	//생성자 + 매개변수
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//getter
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;

	}
	
	//setter : 배열 복사 예제를 위해 필요 (저장값 변겅)
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	//재정의
	//toString
	public String toString() {
		return bookName + ", " + author;
	}
}
