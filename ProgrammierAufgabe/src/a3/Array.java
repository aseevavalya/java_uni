package a3;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		System.out.println("Geben Sie A ein, um ein Array herzustellen, und D um einen Fairen Würfel zu simulieren: ");
		String funk = s.nextLine();
		String funkl = funk.toLowerCase();
		
		switch (funkl) {
			case "a":
				createArray();
				break;
			case "d":
				rollDice();
				break;
			default:
				System.out.println("Keine gültige Eingabe");
		}
	}
		
		private static void createArray() {
			
			System.out.println("Geben Sie Anzahl der Elementen ein: ");
			int n = s.nextInt();
			int[] array = new int[n];

			
			System.out.println("Geben Sie " + n + " Zahlen ein: ");
			for (int i = 0; i < n; i++) {
				array[i] = s.nextInt();	
			}
			
			int unic = 0;
			for (int i = 0; i < n; i++) {
				boolean isDuplicate = false;		

				for (int j = 0; j < unic; j++) {
					if (array[j] == array[i]) {
						isDuplicate = true;
						break;
					}
				}
				if(!isDuplicate) {
					array[unic] = array[i];
					unic++;
					}
				}	
			
			System.out.print("Array ist: { ");
			for (int i = 0; i < unic; i++) {
			System.out.print(array[i] + " ");
			
			}
			System.out.println("}");
			
			int max = Arrays.stream(array).max().orElse(0);
			int min = Arrays.stream(array).min().orElse(0);
			
			
			
			System.out.println("Größte Zahl: " + max);
			System.out.println("Kleinste Zahl: " + min);
			


		}
		
		private static void rollDice() {
			
			int[] frequencies = new int[6];
			
			int target = 1000000;
			while (true) {
				
				int diceRoll = (int) (Math.random() * 6) + 1;
				frequencies[diceRoll - 1]++;
				if (frequencies[diceRoll - 1] >= target) {
					break;
					}
			}
			
			System.out.println("Ergebnis: ");
			System.out.println("Anzahl ­­­\t Häifugkeit");
			
			for (int i = 0; i < frequencies.length; i++) {
				System.out.println((i + 1) + "\t" + frequencies[i]);
			}
			
		}
		


		
		
		
		
		
		
		
		
		
		

	}

