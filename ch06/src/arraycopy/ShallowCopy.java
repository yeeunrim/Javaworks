package arraycopy;

//얕은 복사 - 원본을 수정하니깐 사본도 수정
public class ShallowCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("개미1","박명수");
		array1[1] = new Book("개미2","박명수");
		array1[2] = new Book("개미3","박명수");
		
		//array1의 첫번째 요소 수정
		array1[0].setBookName("아리랑1");
		array1[0].setAuthor("조정래");
		
		//array1 출력
		System.out.println("| array1 출력 |");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		//배열 복사
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		
		//array2 출력
		System.out.println("| array2 출력 |");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		//clone() 메서드 사용
		Book[] array3 = array2.clone();
		
		System.out.println("| array3 출력 |");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array3[i].toString());
		}
		
		//향상 for문
		System.out.println("| array3-1 출력 |");
		for(Book arr3 : array3) {
			System.out.println(arr3.toString());
		}
		
	}

}
