package abstracts.animal;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "강아지";
		System.out.println(kind);
	}

	@Override
	public void sound() {
		System.out.println("왈왈");
	}
}
