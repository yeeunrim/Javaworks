package generics;

public class GenericPrinter<T> {

	private T material;
	
	public void setMeterial(T material) {
		this.material = material;
	}
	
	public T getMeterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
}
