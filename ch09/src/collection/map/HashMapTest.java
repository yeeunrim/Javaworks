package collection.map;

//command + shift + o -> 한꺼번에 import
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		//학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장 
		map.put("임예은", 95); //key-해시코드, value로 구성
		map.put("이나경", 87); 
		map.put("서지훈", 79);
		map.put("임예은", 85); //값만 바껴서 출력되게 된다.
		
		
		//특정 객체 조회 (키 -> 점수)
		System.out.println(map.get("이나경"));
		
		System.out.println("==========================");
		
		//객체 삭제
		if(map.containsKey("임예은")) { //객체가 map에 포함되어 있다면
			map.remove("임예은");       //key를 삭제함으로서 value까지 삭제됨
		}
		
		//총 객체 수
		System.out.println("총 객체 수 : " + map.size());
		
		System.out.println("==========================");
		
		//전체 조회
		Set<String> keySet = map.keySet(); //key 값 객체를 생성
		Iterator<String> ir = keySet.iterator(); //키값으로 반복할 반복자 객체 생성 -> 순서가 없을 때 사용
		while(ir.hasNext()) { //객체 수 만큼 반복
			String key = ir.next(); //객체가 있으면 1개씩 가져옴
			Integer value = map.get(key); //키를 매개로 값을 가져옴
			System.out.println(key + " : " + value);
		}
		
		System.out.println("==========================");
		
		//전체 조회2
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("==========================");
		
		//객체 자체를 출력 - {key=value, ...} 형태로 출력
		System.out.println(map);
		
	}

}
