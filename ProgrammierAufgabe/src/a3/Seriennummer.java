package a3;

import java.util.Scanner;

public class Seriennummer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Geben Sie die Seriennummer ein: ");
		String snummer = s.nextLine().toUpperCase();
		s.close();
		
		if (snummer.length() != 12) {
			System.out.println("Ungültige Eingabe. Seriennummer muss aus 12 Zeichen bestehen.");
			return;
		}
		
		char[] buchstaben = {snummer.charAt(0), snummer.charAt(1)};
		char[] ziffern = snummer.substring(2).toCharArray();
		
		int summe = 0;
		for (char buchstabe : buchstaben) {
			if (buchstabe < 'A' || buchstabe > 'Z') {
				System.out.println("Erste 2 Zeichen müssen Buchstaben sein");
				return;
			}
			summe += (buchstabe - 'A' + 1);
		}
		
		for (char ziffer : ziffern) {
			if (!Character.isDigit(ziffer)) {
				System.out.println("Letzte 10 Zeichen müssen Ziffern sein");
				return;
			}
			summe += Character.getNumericValue(ziffer);
		}
		
		int neunerest = summe % 9;
		
		System.out.println("Der Rest ist: " + neunerest);
		if (neunerest == 7) {
			System.out.println("Seriennummer ist korrekt");
		} else {
			System.out.println("Seriennummer ist falsch");
		}
		
	s.close();
	}
	

}
