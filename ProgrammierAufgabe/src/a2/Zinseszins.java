package a2;

import java.util.Scanner;

public class Zinseszins {
    public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Kapital (in €): ");
	double startKapital  = input.nextDouble();
	
	System.out.println("Prozent (in %): ");
	double zinssatz = input.nextDouble();
	
	System.out.println("Laufzeit (in Jahren): ");
	int laufzeit = input.nextInt();
	
	double endKapital = startKapital * Math.pow(1 + zinssatz/100, laufzeit);
	
	endKapital= Math.round(endKapital * 100.0) / 100.0;
	
	System.out.println("Das Kapital nach " + laufzeit + " Jahren betraegt: " + endKapital + " €.");
    
	input.close();	
    }
}
