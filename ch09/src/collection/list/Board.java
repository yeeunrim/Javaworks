package collection.list;

//VO(Value Object) - 자료형
public class Board {
	
	//필드
	private String title;    //글 제목
	private String content;  //글 내용
	private String writer;   //글쓴이
	
	//매개변수가 있는 생성자
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//getter,setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContect(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
}
