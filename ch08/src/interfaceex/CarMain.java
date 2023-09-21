package interfaceex;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car();
		//myCar.run();
		
		//앞바퀴 교체(변경)
		KumTire kum1 = new KumTire();
		
		myCar.frontLeftTire = kum1;
		myCar.frontRightTire = kum1;
		
		myCar.run();
		
		System.out.println("==================");
		
		Car2 myCar2 = new Car2();
		
		//앞바퀴 교체(변경)
		myCar2.tires[0] = new KumTire();
		myCar2.tires[1] = new KumTire();
		
		myCar2.run();
		
	}

}
