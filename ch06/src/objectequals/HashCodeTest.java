package objectequals;

class Employee{
	//필드 - 멤버변수, 인스턴스변수
	int empId;
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	//equals() 메서드 재정의 
	@Override
	public boolean equals(Object obj) {
		//논리적으로 문제열이 동일하도록 구현
		if(obj instanceof Employee) {//obj가 Employee의 인스턴스라면
			Employee employee = (Employee)obj; //다운 캐스팅 (강제 형 변환)
			if(this.empId == employee.empId) { //기존 필드에 this.Id와 외부에서
				return true;                   //입력한 employee.Id가 일치한다면
			}
		}
		return false;
	}

	@Override
	public int hashCode() { //int형인 empID를 반환함
		return empId;
	}
	
}

public class HashCodeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "장그래");
		Employee emp2 = new Employee(101, "장그래");
		
		System.out.println(emp1 == emp2); //false
		System.out.println(emp1.equals(emp2)); //false //equals 재정의하면 true
		
		//haseCode값 비교 - 동등 객체인지 확인 (문자열 일치 확인)
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		//실제 물리적 주소는 다음! (10진수)
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
	}

}
