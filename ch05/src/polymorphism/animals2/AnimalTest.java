package polymorphism.animals2;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting( ) {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날라갑니다.");
	}
	
}

public class AnimalTest {
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		//Animal type으로 객체 생성 (다형성) - 자동 형 변환
		//Animal animal = new Human(); //readBook이 안나옴
		
		//moveAnimal() 호출
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		System.out.println("**** 자식형으로 다운 캐스팅 *****");
		//크기가 3인 Animal 인스턴스를 저장할 배열 생성
		Animal[] animals = new Animal[3];
		
		//자식 객체 생성
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		for(int i=0; i<animals.length; i++) {
			Animal animal = animals[i]; //0번 인덱스부터 객체 저장
			if(animal instanceof Human) {
				Human human = (Human)animal; //Human 타입 강제 형 변환
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}
		
		//강제 형 변환 - instanceof 키워드 사용
		 
		/* if(animal instanceof Human) {
			Human human = (Human)animal; //자식 타입 = (자식 타입) 부모 타입
			human.readBook();
		} 
		
		if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal; //자식 타입 = (자식 타입) 부모 타입
			tiger.hunting();
		} 
		
		if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal; //자식 타입 = (자식 타입) 부모 타입
			eagle.flying();
		} 
		*/
		

	}

}
