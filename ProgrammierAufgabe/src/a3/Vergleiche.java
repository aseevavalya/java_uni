package a3;
import java.util.Scanner;

public class Vergleiche {
	    
	    private static Scanner s = new Scanner(System.in);
	    
	    public static void main(String [] args) {
	    	System.out.println("Willst du Namen (N) oder Zahlen (Z) vergleichen? ");
	    	
	        String auswahl = s.next();
	        
	        switch(auswahl) {
	        case "N", "n":
	        	compareNames();
	        	break;
	        case "Z", "z":
	        	compareNumbers();
	        	break;
	       default: 
	        	System.out.println("Falsche Eingabe");
	        	break;
	        }
	        
	        
	    }
	    
	    public static void compareNames() {
	        System.out.println("2 Namem eingeben: ");
	        String name1 = s.next();
	        String name2 = s.next();
	        
	        int name1length = name1.length();
	        int name2length = name2.length();
	        
	        if (name1length > name2length) {
	        	System.out.println(name1 + " hat mehr Buchstaben als " + name2);
	        } else if (name2length > name1length) {
	        	System.out.println(name2 + " hat mehr Buchstaben als " + name1);
	        } else {
	        	System.out.println(name1 + " hat glaich viele Buchstaben wie " + name2);
	        }
	        
	    }
	    
	    public static void compareNumbers() {
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        
	        System.out.println("Summe: " + a + b + c);
	        System.out.println("Durchschnitt: " + (a + b + c) / 3);
	        System.out.println("Produkt: " + a * b * c);
	        
	        if (a < b) {
	        	if (a < c) {
	        		System.out.println(a + " ist am Kleinsten.");
	        	} else {
	        		System.out.println(c + " ist am ");
	        	}
	        } else {
	        	if (b < c) {
	        		System.out.println(b + " ist am Kleinsten.");
	        	} else {
	        		System.out.println(c + " ist am Kleinsten.");
	        	}
	    }
	}
}
