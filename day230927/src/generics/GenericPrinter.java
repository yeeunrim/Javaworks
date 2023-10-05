package generics;

public class GenericPrinter<T extends Material> {

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
	
	public void printing() {
		material.doPrinting();
	}
	
}
