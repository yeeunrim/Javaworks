package reference.circle;

public class CircleTest {

	public static void main(String[] args) {
		/*Circle c1 = new Circle(2, 5, 7);
		c1.showCircleInfo();
		
		Circle c2 = new Circle(10, 12, 10);
		c2.showCircleInfo();
		*/
		
		//객체 배열
		/* Circle[] circle = {
				new Circle(2, 5, 7), //Circle[0]
				new Circle(10, 12, 10), //Circle[1]
				new Circle(-8, -4, 10) //Circle[2]
		}; */
		
		Circle[] circle = new Circle[3];
		circle[0] = new Circle(2, 5, 7);
		circle[1] = new Circle(10, 12, 10);
		circle[2] = new Circle(-8, -4, 10);
		
		//일부 조회
		circle[2].showCircleInfo();
		
		System.out.println();
		
		//전체 조회
		for(int i=0; i<circle.length; i++) {
			circle[i].showCircleInfo();
		}
		
	}
}
