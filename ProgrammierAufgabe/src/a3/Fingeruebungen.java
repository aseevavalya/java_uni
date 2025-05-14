package a3;

public class Fingeruebungen {

	public static void main(String[] args) {
		
    //    int[][] array = new int[3][4];
      	
        	//{
		     //{1, 2, 3},
		   //  {4, 5, 6},
		   //  {7, 8, 9}
       // };
		        		 
       // for (int i = 0; i < array.length; i++) { // здесь было и в квадратных скобках и давало ошибку - выход за пределы массива. 
        	//System.out.print(i + ".");
        //	for (int j = 0; j < array[i].length; j++) {
            	//System.out.print(i + ".");
            	
        	//	System.out.print(array[i][j] + " ");
        //	}
      //  System.out.println();
       // }
		
		// ТАБЛИЦА УМНОЖЕНИЯ:
		
//		int[][] einmaleins = new int[10][10];
//		
//		for (int row = 0; row < einmaleins.length; row++) {
//			System.out.print(row);
//			for (int col = 0; col < einmaleins[0].length; col++) {
//				einmaleins[row][col] = ((row + 1) * (col + 1));
//			}
//		}
//		
//		for (int row = 0; row < einmaleins.length; row++) {
//			for (int col = 0; col < einmaleins[0].length; col++) {		
//				
//				System.out.print(einmaleins[row][col] + "­\t");
//			}
//		    System.out.println();
//
//	    }
//	}

	
	// ШАХМАТЫ
		
		int size = 5;
		char[][] chessBoard = new char[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((i + j) % 2 == 0) {
					chessBoard[i][j] = '#';
				} else {
					chessBoard[i][j] = '*';
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(chessBoard[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
