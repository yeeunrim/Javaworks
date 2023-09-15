package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		//크기가 3인 배열 객체 생성
		User[] users = new User[3];
		
		//3개의 객체 생성
		User user1 = new User("bird99", "1234", "기러기");
		User user2
		= new User("hong12", "abd123", "홍길동");
		User user3 = new User("armyyo", "9895", "박격포");
		
		//객체를 배열에 저장
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		
		//user1 출력 - getter 이용
		System.out.println(user1.getId() + ", " + user1.getPwd()
		+ ", " + user1.getName());
		
		System.out.println();
		
		//전체 출력 - toString 이용
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]);
		}
	
	}

}
