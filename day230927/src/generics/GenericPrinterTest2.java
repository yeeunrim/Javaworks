package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMeterial(new Powder());
		powderPrinter.printing();
		System.out.println(powderPrinter);
		
		System.out.println("=====================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMeterial(new Plastic());
		plasticPrinter.printing();
		System.out.println(plasticPrinter);
		
	}

}
