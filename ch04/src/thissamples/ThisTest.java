package thissamples;

public class ThisTest {

	public static void main(String[] args) {
		//생성된 인스턴스 : bDay 주소  = BirthDay의 this 속성 주소
		BirthDay bDay = new BirthDay();
		bDay.setyear(2023);
		
		System.out.println(bDay); //thissamples.BirthDay@7c30a502
		
		bDay.printThis(); //thissamples.BirthDay@7c30a502
		
	}

}
