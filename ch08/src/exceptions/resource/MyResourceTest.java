package exceptions.resource;

public class MyResourceTest {

	public static void main(String[] args) throws Exception {
		
		MyResource res1 = new MyResource("res1");
		
		//System.out.println(res1.read1());
		//System.out.println(res1.read2());
		
		System.out.println(Integer.parseInt(res1.read1()));
		//문자가 있기 때문에 오류가 발생
		System.out.println(Integer.parseInt(res1.read2())); 
		
		res1.close();
		
	}

}
