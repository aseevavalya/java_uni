package a1;

import java.util.Scanner;

public class Potenz {
	public static void main (String argv[]) {
		

	double a;
	double b;
	
    Scanner input = new Scanner(System.in);
    
    System.out.print("Geben Sie die Basis ein (Verwenden Sie ein Komma für Gleitkommazahlen): ");
    a = input.nextDouble(); 

    System.out.print("Geben Sie den Exponenten ein (Verwenden Sie ein Komma für Gleitkommazahlen): ");
    b = input.nextDouble(); 
    
    double resultDouble = Math.pow(a, b);
    
    int resultInt = (int) Math.round(resultDouble);
    
    System.out.println("Das Ergebnis der Gleitkommaberechnung: " + resultDouble);
    System.out.println("Das Ergebnis der Ganzzahlberechnung: " + resultInt);
    
    input.close();
	}  
}
