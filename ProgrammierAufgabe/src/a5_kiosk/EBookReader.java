package a5_kiosk;

public class EBookReader extends KioskInhalt implements Kaufbar, Elektronisch {
	private double preis = 55.0;

	public EBookReader(String name) {
		super(name);
		this.preis = 55.0;
	}

	@Override
	public double getStromverbrauch() {
		return 0.25;
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
