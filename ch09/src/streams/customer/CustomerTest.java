package streams.customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {

		List<Customer> customerList = Arrays.asList(
			new Customer("임예은", 25, 5000),
			new Customer("이나경", 25, 7000),
			new Customer("서지훈", 25, 6500)
		);
		
		System.out.println("=== 고객 명단 ===");
		Stream<Customer> customerStream = customerList.stream();
		customerStream.map(c -> c.getName())
					  .forEach(s -> System.out.println("이름 : " + s));

		System.out.println("=== 총 여행 비용 ===");
		
		int total = customerList.stream()
								.mapToInt(c -> c.getPrice())
								.sum();
		
		System.out.printf("총 여행 비용 : %,d원\n", total);
		
		System.out.println("=== 나이가 20세 이상인 고객의 명단 ===");
		//filter(), map(), sorted(), forEach()
		customerList.stream()
					.filter(c -> c.getAge() >= 20)
					.map(c -> c.getName())
					.sorted()
					.forEach(s -> System.out.println("이름 : " + s));
		
	}

}
