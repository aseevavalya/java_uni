package a5_kiosk;

public class Kasse extends KioskInhalt implements Elektronisch {
	
	public Kasse(String name) {
		super(name);
	}

	@Override
	public double getStromverbrauch() {
		// TODO Auto-generated method stub
		return 0.5;
	}

}
