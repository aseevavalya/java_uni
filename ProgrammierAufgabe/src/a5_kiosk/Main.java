package a5_kiosk;

public class Main {
	
	public static void main(String[] args) {
		Kiosk kiosk = new Kiosk("Roberts Kiosk");
		
		kiosk.inhaltHinzufuegen(new Zeitung("Roberts Gute Zeitung"));
		
		
		
		
		System.out.println(kiosk.toString());
	}

}
