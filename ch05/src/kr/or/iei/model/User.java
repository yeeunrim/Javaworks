package kr.or.iei.model;

//회원(User)클래스 생성
public class User {
	//필드(속성)
	private String id;
	private String pwd;
	private String name;
	
	//기본 생성자 - 생략 가능
	public User() {
		System.out.println("기본 생성자 - User");
	} 
	
	//생성자에 매개변수를 이용해서 데이터 저장
	//set()함수와 같은 역할
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	} // -> 이것을 사용할 경우에는 기본 생성자가 있어야 한다.
	
	//set(), get() 함수를 이용해서 데이터 저장
	//1. id - 입력, 출력
	public void SetId(String id) { //입력하는 것은 반환이 아니기 때문에 void 사용
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	//2. pwd - 입력, 출력
	public void SetPwd(String pwd) { 
		this.pwd = pwd;
	}
	
	public String getPwd() { //반환값이 있기에 String을 사용
		return pwd;
	}
	
	//3. name - 입력, 출력
		public void SetName(String name) { 
			this.name = name;
		}
		
		public String getName() { 
			return name;
		}
	
}
