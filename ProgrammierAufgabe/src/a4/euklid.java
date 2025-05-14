package a4;

public class euklid {

	public static void main(String[] args) {

	}
	
	private static int ggt(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			return ggt(a - b, b);
		} else {
			return ggt(a, b - a);
		}
	}

}
