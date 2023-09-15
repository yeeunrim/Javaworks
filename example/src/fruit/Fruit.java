package fruit;

//과일종류, 개수, 종류
public class Fruit {
		//필드
		String name;
		int price;
		int count;
			
		//기본 생성자
		public Fruit() {}
		
		//메서드
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setCount(int count) {
			this.count = count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void showFruitInfo() {
			System.out.println(name + "의 갯수는 " + count + "개이며, 가격은 " + price + "원이다.");
		}
}
