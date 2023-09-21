package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		//MemberArrayList 클래스의 객체 생성
		MemberArrayList memberList = new MemberArrayList();
		
		//Member 객체 생성
		Member mem1 = new Member(1001, "임예은");
		Member mem2 = new Member(1002, "이나경");
		Member mem3 = new Member(1003, "서지훈");
		Member mem4 = new Member(1002, "이나경");
		
		//회원 추가 메서드 호출
		memberList.addMember(mem1);
		memberList.addMember(mem2);
		memberList.addMember(mem3);
		memberList.addMember(mem4);
		
		//회원 삭제
		memberList.removeMember(1002); //먼저 들어갔던 1번 인덱스의 결과가 삭제됨
		memberList.removeMember(1004); 
		
		System.out.println("==================");
		
		//총 객체 수
		System.out.println("총 객체 수 : " + memberList.getSize());
		
		System.out.println("==================");
		
		//회원 정보 출력
		memberList.showAllMember();
	}

}
