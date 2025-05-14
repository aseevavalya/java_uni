package a4;

public class Ackermann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int ackermann(int n, int m) {
		if (n == 0) {
			return m + 1;
		} else if (m == 0) {
			return ackermann(n-1, 1);
		} else {
			return ackermann(n-1, ackermann(n, m-1));
		}
		
	}

}
