package a2;

import java.util.Scanner;

public class Zinssatz {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kapital (in €): ");
		double startKapital  = input.nextDouble();
		
		System.out.println("Endkapital (in €): ");
		double endKapital = input.nextDouble();
		
		System.out.println("Laufzeit (in Jahren): ");
		int laufzeit = input.nextInt();
		
		double zinssatz = (Math.pow(endKapital / startKapital, 1.0 / laufzeit) - 1) * 100;
		
		System.out.println("Der erforderliche Zinssatz beträgt: " + zinssatz + " %.");

		
	input.close();

	}
}
