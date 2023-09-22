package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가
		memberMap.addMember(new Member(1001, "임예은"));
		memberMap.addMember(new Member(1002, "박격포"));
		memberMap.addMember(new Member(1003, "서지훈"));
		//키는 중복이 불허, 값은 변경 가능
		memberMap.addMember(new Member(1002, "이나경")); 
		
		//객체 수 호출
		System.out.println("총 객체 수 : " + memberMap.getSize());
		
		System.out.println("==============");

		//회원 삭제
		memberMap.removeMember(1003);
		memberMap.removeMember(1004);
		
		System.out.println("==============");
		
		System.out.println("총 객체 수 : " + memberMap.getSize());
		
		System.out.println("==============");
		
		//회원 목록 출력
		memberMap.showAllMember();;
		
	}

}
