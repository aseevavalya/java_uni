package a7_Kassenzettel;

public class Eintrag {
	private String productName;
	private int menge;
	private double preis;
	
	public Eintrag(String productName, int menge, double preis) {
		this.productName = productName;
		this.menge = menge;
		this.preis = preis;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public double gesamtPreis() {
		return menge * preis;
	}

	@Override
	public String toString() {
		return String.format("%-20s \n%dx %18.2f", productName, menge, preis);
	}
}
