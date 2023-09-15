package arraycopy;

//깊은 복사 - 원본을 수정해도 사본은 변함 없음
//객체를 새로 생성해서 복사한 것이기 떄문에 array1과 array2는 별개로 작용
public class DeepCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("개미1","박명수");
		array1[1] = new Book("개미2","박명수");
		array1[2] = new Book("개미3","박명수");
		
		//기본 생성자로 array2의 객체 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//배열 복사(setter,getter)
		for(int i=0; i<array2.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		
		//array1(원본)의 첫번째 요소 수정
		array1[0].setBookName("아리랑1");
		array1[0].setAuthor("조정래");
		
		
		//출력
		//array1 출력
		System.out.println("| array1 출력 |");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		//array2 출력
		System.out.println("| array2 출력 |");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array2[i].toString());
		}

	}

}
