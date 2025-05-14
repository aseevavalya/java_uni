package a1;

import java.util.Scanner;

public class ZylinderVolumen {
    public static void main (String argv[]) { 
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Bitte geben sie den Radius des Zylinders ein: ");
    	double r = input.nextDouble();
    	
    	System.out.println("Bitte geben sie die Höhe des Zylinders ein: ");   	
    	double h = input.nextDouble();
    	
    	double volumen = Math.PI * Math.pow(r, 2) * h;
    	
    	double s = 2 * Math.PI * r * (r + h);
    	
    	System.out.printf("Das Volumen des Zylinders beträgt: %.2f\n", volumen);
    	System.out.printf("Der Oberflächeninhalt des Zylinders beträgt: %.2f", s);
    	
    	input.close();
    	
    }
}
