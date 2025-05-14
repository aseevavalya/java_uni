package a5_kiosk;

public class Kiosk {
	private String name;
	private KioskInhalt[] kioskinhalte = new KioskInhalt[10];
	
	public Kiosk (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public KioskInhalt[] getKioskinhalte() {
		return kioskinhalte;
	}
	
	public void inhaltHinzufuegen(KioskInhalt inhalt) {
		for (int i = 0; i < kioskinhalte.length; i++) {
			if (kioskinhalte[i] == null) {
				kioskinhalte[i] = inhalt;
				return; 
			}
		}
		
		System.err.println("Kiosk ist voll");
	}
	
	@Override
	public String toString() {
		String out = "";
		
		out += getName() + " Inventar:\n\n";
		
		for (KioskInhalt inhalt : kioskinhalte) {
			if (inhalt != null) {
				out += inhalt.getName();
				
				if (inhalt instanceof Zeitung) {
					out += ", " + ((Zeitung)inhalt).getPreis() + "\n";
				} else if (inhalt instanceof Kasse) {
					out += " , Stromverbrauch : " + ((Kasse)inhalt).getStromverbrauch() + "\n";
				} else if (inhalt instanceof EBookReader) {
					out += ", Preis: " + ((EBookReader)inhalt).getPreis() + " , Stromverbrauch: " + ((EBookReader)inhalt).getStromverbrauch() + "\n";
				}
						
			}
		}
				
		return out;
	}

}
