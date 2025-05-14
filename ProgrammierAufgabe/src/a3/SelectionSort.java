package a3;


import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

		public static void main(String[] args) {

			
			if(args.length == 0) {
				System.out.println("Geben Sie bitte die Länge des Arrays ein: ");
				Scanner s = new Scanner(System.in);
				int arrayLength = s.nextInt();
				s.close();
				
				int[] array = newArray(arrayLength);
				System.out.print("Original Array: ");
				showArray(array);
				
				mixArray(array);
				System.out.print("Gemischtes Array: ");
				showArray(array);
				
				System.out.print("Sortierung beginnt: ");
				selectionSort(array);


			} else {
				// Hier nichts veraendern. Dies ist nur fuer die Bewertung.
				if(args[0].equals("random")) {
				    int arrayLength = Integer.parseInt(args[1]);
		    		List<int[]> listOfArrays = new ArrayList<int[]>();
		    		int[] sortedArray = newArray(arrayLength);
					for(int i = 0; i < 10; i++) {
						int[] mixedArray = newArray(arrayLength);
						mixArray(mixedArray);
						if(!listOfArrays.contains(mixedArray)) {
							listOfArrays.add(mixedArray);
						}
					}
					if(listOfArrays.size() > 5) {
						System.out.println("OK");
					} else {
						System.out.println("Error");
					}
				} else {
	    			int arrayLength = Integer.parseInt(args[0]);
		    		showArray(newArray(arrayLength));
			    	int[] customArray = new int[arrayLength];
				    for(int i = 0; i < arrayLength; i++){
					    customArray[i] = Integer.parseInt(args[i+1]);
	    			}
				    
				    selectionSort(customArray);
				}
			}

		}

		private static int[] newArray(int n) {
			int [] array = new int[n];
		    for (int i = 0; i < n; i++) {
		    	array[i] = i+1;
		    }
		    
		    return array;
		}

		private static void mixArray(int[] array) {
			Random random = new Random();
		    for (int i = array.length - 1; i > 0; i--) {
		    	int j = random.nextInt(i+1);
		    	int temp = array[i];
		    	array[i] = array[j];
		    	array[j] = temp;
		    } 
		}

		private static void showArray(int[] array) {
		    System.out.print("{");
		    for (int i = 0; i < array.length; i++) {
		    	if (i == array.length - 1) {
		    		System.out.print(array[i] + "}\n");
		    	} else {
		    		System.out.print(array[i] + ", ");
		    	}
		    }
		}

		private static void selectionSort(int[] array) {
			int i = 0;
			for (; i < array.length - 1; i++) {
				int minI = i;
				for (int j = i+1; j < array.length; j++) {
					if (array[j] < array[minI]) {
						minI = j;
					}
				}
				int temp = array[i];
				array[i] = array[minI];
				array[minI] = temp;
						
			} 
		showArray(array);
		}

}

