package a1;

import java.util.Scanner;

public class Pythagoras {
    public static void main (String argv[]) { 
    	
    	int a;
    	int b;
    	
    	try (Scanner input = new Scanner(System.in)) {
			
    		System.out.println ("Länge Seite A: ");
			a = input.nextInt();  
			
			System.out.println ("Länge Seite B: ");
			b = input.nextInt();
		}
    	
        System.out.println("Länge Hypotenuse ist " + Math.sqrt(a * a + b * b));
    	
    }

}
