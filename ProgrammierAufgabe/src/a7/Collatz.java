package a7;

public class Collatz {
	
	public static void main(String[] args) {
		System.out.println(collatz(19,10));
	}
	
	public static int collatz(int n, int i) {
		if (i == 0) {
			return n;
		}
		
		if (n % 2 == 0) {
			return collatz(n/2, i-1);
		} else {
			return collatz(3 * n + 1, i-1);
		}
	}

}
