package a3;

import java.util.Scanner;

public class Schleifen {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		 

		
    	System.out.println("Welche Funktion möchten Sie verwenden (P für Palindrom,"
    		              	+ "V für Vokale, R für Raute, B für Binärdarstellung)");
    	String choice = s.nextLine().toUpperCase();
    	
    	switch (choice) {
    	  case "P":
    		palindrome();
    		break;
    		
    	  case "V":
    		  vowels();
    	      break;
    	  case "R":
    		  rhombus();
    	      break;
    	  case "B":
    		  binary();
    	      break;
    	  
    	  default: 
    		  System.out.println("Keine gültige Eingabe.");
    	}
        

        
    }
    
    public static void palindrome() {
    	System.out.println("Geben Sie einen Text ein:");
    	String text = s.nextLine().toLowerCase().replaceAll("­[^a-z0-9]", "");
    	String reversedText = new StringBuilder(text).reverse().toString();
    	
    	if (text.equals(reversedText)) {
    		System.out.println("true");
    	} else {
    		System.out.println(false);
    	} 
    }
    
    public static void vowels() {
        System.out.println("Geben Sie ein Wort ein:");
        String word = s.nextLine().toLowerCase();
        
        int vowels = 0, consonants = 0, others = 0;
        for (int i = 0; i < word.length(); i++) {
        	char c = word.charAt(i);
        	if ("aeiou".indexOf(c) != -1) {
        		vowels++;
        	} else if (Character.isLetter(c)) {
        		consonants++;
        	} else {
        		others++;
        	}
        }
        
        System.out.println("Vokale:" + vowels + ", Konsonanten: " + consonants + ", übrigen Zeichen: " + others);
        
    }
    
    public static void rhombus() {
        System.out.println("Geben Sie die Größe der Raute ein (ungerade Zahl):");
        int n = s.nextInt();
        
        if (n % 2 == 0) {
        	System.out.println("Das Programm arbeitet nur mit ungeraden Werten.");
        	return;
        }
        int spaces = n; 
        for (int i = 1; i <= n; i += 1) {
        	System.out.print(i);
        	System.out.print(" ".repeat(spaces));
        	System.out.println("* ".repeat(i));
        	spaces--;
        }
        spaces = 1;
        for (int i = n - 1; i > 0; i -= 1) {
        	System.out.print(i);
        	System.out.print(" ".repeat(spaces + 1));
        	System.out.println("* ".repeat(i));
        	spaces++;
        	
        }
    }
    
    public static void binary() {
        System.out.println("Geben Sie eine positive ganze Zahl: ");
        int number = s.nextInt();
        
        if (number < 0) {
        	System.out.println("Nur posirive Zahlen sind erlaubt.");
        	return;
        }
        
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
        	binary.insert(0, number % 2);
        	number /= 2;
        }
        System.out.println("Binärdarstellung: " + binary);
        s.close();    
    }
}

