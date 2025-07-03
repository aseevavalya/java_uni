package a7_Kassenzettel;

import java.util.ArrayList;
import java.util.List;

public class Kassenzettel {

	private List<Eintrag> eintraege;
	
	public Kassenzettel() {
		this.eintraege = new ArrayList<>();
	}
	
	public void addEintrag(Eintrag eintrag) {
		eintraege.add(eintrag);
	}
	
	public double getGesamtSumme() {
		double summe = 0;
		for (Eintrag e : eintraege) {
			summe += e.gesamtPreis();
		}
		return summe;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("------------------------\n");
		sb.append("  Programmierpraktikum \n");
		sb.append("     Einkaufsliste \n");
		sb.append("------------------------\n");
		for (Eintrag e : eintraege) {
			sb.append(e).append("\n");
		}
		sb.append("========================\n");
		sb.append(String.format("Summe EUR %11.2f\n", getGesamtSumme()));
		sb.append("========================\n");
		return sb.toString();
	}	
}
