package a6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOString {
	public static void main(String[] args) {
		try { 
			schreibeInDatei("Hallo Welt.", "Hallo.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	

		try {
			System.out.println(leseAusDatei("Hallo.txt"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	}
		
		private static void schreibeInDatei(String text, String name) throws IOException {
	        FileWriter writer = new FileWriter(name);
	        BufferedWriter buffer = new BufferedWriter(writer);
	        
	        writer.write(text);
	        writer.close();
		}
		
		public static String leseAusDatei(String name) throws FileNotFoundException, IOException {
			FileReader reader = new FileReader(name); 
			BufferedReader buffer = new BufferedReader(reader);
			
			String out = "";
			
			String zeile = buffer.readLine();
			
			while (zeile != null) {
				out += zeile + "\n";
				zeile = buffer.readLine();
			}
			
			buffer.close();
			
			return null;
		}
		
		
}
		


    
    
	
	


