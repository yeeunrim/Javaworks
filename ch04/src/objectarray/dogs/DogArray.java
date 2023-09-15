package objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		//Dog 인스턴스 4개 생성를 생성해서 배열에 저장하고
		//정보를 출력하세요. (get()함수 사용)
		Dog[] dogs = new Dog[4];
		
		//배열의 저장(입력)
		dogs[0] = new Dog("쿠키", "닥스훈트");
		dogs[1] = new Dog("두부", "말티즈");
		dogs[2] = new Dog("초코", "푸들");
		dogs[3] = new Dog("백구", "진돗개");
		
		//전체 출력
		for(int i=0; i<dogs.length; i++){
			System.out.println(dogs[i].getName() + ", "+ dogs[i].getType());
		}
		
		System.out.println();
		
		//향상된 for문
		for(Dog dog : dogs) {
			System.out.println(dog.getName() + ", "+ dog.getType());
		}

	}

}
