package a1;

import java.util.Scanner;   

public class BasicIO { 
    /**
     * @param argv
     */
    public static void main (String argv[]) { 
        
        String name;    
        int age;        

        Scanner input = new Scanner(System.in);
        
        System.out.println ("Wie lautet dein Name?");
        name = input.next();    
        
        System.out.println ("Wie alt bist du?");
        age = input.nextInt();        
         
        System.out.print("Hallo " + name + ", du bist " + age + " Jahre alt."); 
        
        input.close();                          
    }
}