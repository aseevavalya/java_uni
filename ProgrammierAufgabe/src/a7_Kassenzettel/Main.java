package a7_Kassenzettel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Kassenzettel kassen = new Kassenzettel();
		
		while(true) {
			System.out.println("name: ");
			String productName = s.nextLine();
			
			if (productName.equalsIgnoreCase("x")) {
				break;
			}
			System.out.println("menge: ");
			int menge = s.nextInt();
			
			System.out.println("preis: ");
			double preis = s.nextDouble();
			s.nextLine();
			
			kassen.addEintrag(new Eintrag(productName, menge, preis));
		}
		s.close();
		System.out.println(kassen);
	}
}
