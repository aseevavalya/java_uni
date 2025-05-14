package a3;

import java.util.Scanner;

public class Scooter {

	public static void main(String[] args) {
      
	   Scanner input = new Scanner(System.in);
       
       System.out.println("Anbieter 1-4 wählen oder 5. Komfortfunktion: ");
       System.out.println("Anbieter 1: 1€ Unlockgebühr, 0.50€/500m\n"
    		   + "Anbieter 2: 0€ Unlockgebühr, 0,75€/500m\n"
    		   + "Anbieter 3: 5€ Unlockgebühr, 0.00€/500m\n"
    		   + "Anbieter 4: 1€ Unlockgebühr, 0.11€/100m\n"
    		   + "5. Komfortfunktion");
      
       int auswahl = input.nextInt(); //???
       
       System.out.println("Distanz in Metern eingeben: ");
       double distanz = input.nextInt();
       double distanzinkm = distanz / 1000;
    		   
       double preis = 0;
       String providerName = "";
       
       switch(auswahl) {
       case 1: preis = 1 + (0.5/500)*distanz; break;
       case 2: preis = (0.75/500)*distanz; break;
       case 3: preis = 5; break;
       case 4: preis = 1 + (0.11/100)*distanz; break;
       case 5: 
    	   double cost1 = 1 + (distanz / 500) * 0.5;
           double cost2 = (distanz / 50) * 0.75;
           double cost3 = 5;
           double cost4 = 1 + (distanz / 100) * 0.11;
           
           preis = Math.min(Math.min(cost1, cost2), Math.min(cost3, cost4));
           
           if (preis == cost1) providerName = "Anbieter 1";
           else if (preis == cost2) providerName = "Anbieter 2";
           else if (preis == cost3) providerName = "Anbieter 3";
           else if (preis == cost4) providerName = "Anbieter 4";
           break;
           
       default: 
    	   System.out.println("Falsche Eingabe");
    	   System.exit(0);
    	   break;
       }
       
       System.out.printf("%.2f Kilometer sollen gefahren werden. Der Scooter wurde entriegelt.\n", distanzinkm);
       System.out.printf("Der Preis für die geplante Fahrt beträgt: %.2f€\n", preis);
      

	   
       if (auswahl == 5) {
    	   System.out.println("Günstigster Anbieter: " + providerName);
       } else { 
    	   System.out.println("Vielen Dank, dass Sie sich für Anbieter " + auswahl + " entschieden haben!");
       }
       input.close();  
       
	}

}
