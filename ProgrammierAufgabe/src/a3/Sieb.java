package a3;

import java.util.Scanner;

public class Sieb {

	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
        System.out.print("Geben Sie die letzte Zahl ein: ");
		int n = s.nextInt();

        boolean[] isPrimArray = new boolean[n+1];
        isPrimArray[0] = false;
        isPrimArray[1] = false;
        
        
        for (int i = 2; i <= n; i++) {
        	isPrimArray[i] = true;
        }
   
   
        for (int i = 2; i * i <= n; i++) {
            System.out.println("i = " + i);
        	 if (isPrimArray[i]) {
        		 for (int j = i*i; j<=n; j+=i) {
        	         System.out.println("j = " + j);
        			 isPrimArray[j] = false;
        		 }
             }
    	 }
    
        System.out.println("Primzahlen bis " + n + ": ");     
        for (int i = 2; i <= n; i++) {
            if (isPrimArray[i]) {
            System.out.print(i + " ");
            }
        }      
        
        s.close();
	}
}
