package a4;

public class Binomial {

	public static void main(String[] args) {
		
		
	}
		
	private static int fakultaet(int n) {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * fakultaet(n-1);
			}
	}
		
	private static int binomialRekursiv(int n, int k) {
			if (k == 0) {
				return 1; 
			} else if (n == 0) {
				return 0;
			} else {
				return binomialRekursiv(n-1, k-1) + binomialRekursiv(n-1, k);
			}
			
	}
	
	



}
