package a2;

import java.util.Scanner;

public class Dauer {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kapital (in €): ");
		double startKapital  = input.nextDouble();
		
		System.out.println("Prozent (in %): ");
		double zinssatz = input.nextDouble();
		
		System.out.println("Endkapital (in €): ");
		double endKapital = input.nextDouble();
		
		double laufzeit = Math.log(endKapital / startKapital) / Math.log(1 + zinssatz / 100);
		
		int jahre = (int) Math.ceil(laufzeit);
		
		System.out.println("Die benötige Dauer der Investition beträgt: " + jahre + " Jahre.");
		
	    input.close();
	}
}
