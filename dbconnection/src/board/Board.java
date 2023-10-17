package board;

import java.io.Serializable;
import java.sql.Date;

//DTO - 자료 전달 객체
public class Board implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//필드
	private long bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	
	//기본 생성자
	public Board() {};
	
	//getter, setter
	public long getBno() {
		return bno;
	}
	public void setBno(long bno) {
		this.bno = bno;
	}
	
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

}