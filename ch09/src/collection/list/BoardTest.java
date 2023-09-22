package collection.list;

//import java.util.*; -> 이것도 가능
import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		//ArrayList 사용 - 속도가 더 빠름
		//List<Board> list = new ArrayList<>();
		
		//Vector 사용 - 안정성 높음
		List<Board> list = new Vector<>();
		
		//Board 객체 생성
		Board board1 = new Board("제목1", "내용1", "글쓴이1");
		Board board2 = new Board("제목2", "내용2", "글쓴이2");
		Board board3 = new Board("제목3", "내용3", "글쓴이3");
		
		//객체를 벡터에 저장
		list.add(board1);  //0번
		list.add(board2);  //1번
		list.add(board3);  //2번
		
		//게시글 1개 삭제
		if(list.contains(board2)) { 
			//list.remove(1);      //Index로 삭제해도 되고,
			list.remove(board2);  //Object로 삭제해도 된다.
		}
		
		//맨 앞에 있는 객체 가져오가(0번 인덱스)
		System.out.println("제목 : " + list.get(0).getTitle());
		System.out.println("내용 : " + list.get(0).getContent());
		System.out.println("글쓴이 : " + list.get(0).getWriter());
		
		System.out.println("============================");
		
		//전체 목록
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " + board.getContent() + ", " + board.getWriter());
		}
		
		
	}

}
