package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	
	public double divide(double x, double y) throws IllegalArgumentException{
		if(y == 0.0) {
		throw new IllegalArgumentException();
		}
		return x/y;
	}
	public String reverseString() {
		
	}
}
