package a3;

public class KuchenP {
 public static void main(String[] args) {
	 int istDrin = 0; // STreusel im Kreis 
	 
	 for (int i = 0; i < 3000000; i++) {
		 double x = Math.random() * 2 - 1;
		 double y = Math.random() * 2 - 1;
		 
		 if (x * x + y * y < 1) {
			 istDrin++;
		 }
		 if (i % 3000000 == 0) {
			 System.out.println((4.0 * istDrin) / i);
		 }
	 }
 System.out.println(Math.PI);
 }
 
}
