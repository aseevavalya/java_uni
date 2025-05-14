package a5_kiosk;

public class Zeitung extends KioskInhalt implements Kaufbar {
	private double preis;

	public Zeitung(String name) {
		super(name);
	}

	@Override
	public double getPreis() {
		return preis;
	}

	@Override
	public void setPreis(double preis) {
		this.preis = preis;

	}

}
