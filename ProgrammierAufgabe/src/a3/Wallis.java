package a3;

public class Wallis {
	public static void main(String[] args) {
		double produkt = 2; 
		
		for (int i = 2; i <= 2000000; i++) {
			if (i % 2 == 0) {
				produkt = produkt * i / (i + 1);
			} else {
				produkt = produkt * (i + 1) / i;
			}
			
			if (i %  2000000 == 0) {
				System.out.println(produkt);
			}
		}
	System.out.println(produkt * 2);
	
	}
}
