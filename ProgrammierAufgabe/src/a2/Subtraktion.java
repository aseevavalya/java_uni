package a2;

import java.util.Scanner;

public class Subtraktion {
	 public static void main(String[]args) {
		 Scanner input = new Scanner(System.in);
		 
		 int a = 50 + (int)(Math.random() * 51);
		 
		 int b = 1 + (int)(Math.random() * 50);
		 
		 System.out.println("Was ist die Subtraktion von " + a + " und " + b + "?");
		 int userAnswer = input.nextInt();
		 
		 int correctAnswer =  a - b;
		 boolean isCorrect = (userAnswer == correctAnswer);
		 
		 System.out.println("Ihre Antwort ist: " + isCorrect);
		 
		 input.close();
	 }
}
