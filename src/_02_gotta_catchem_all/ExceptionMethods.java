package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	
	public double divide(double x, double y) throws IllegalArgumentException{
		if(y == 0.0) {
		throw new IllegalArgumentException();
		}
		return x/y;
	}
	public String reverseString(String h) throws IllegalStateException{
		String ans = "";
		if(h.length() == 0) {
			throw new IllegalStateException();
		}
		
		for (int i = h.length()-1; i >= 0; i--) {
			ans += h.charAt(i);
		}
		
		return ans;
	}
}
