package funcinterface.lambdastring;

public class StringConcatTest1 {

	public static void main(String[] args) {
		
		StringConcat concat = new StringConcatInpl();
		
		concat.makeString("kh", "정보교육");
	}

}
