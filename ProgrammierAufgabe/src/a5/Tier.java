package a5;

public abstract class Tier {
	protected Schreiverhalten schreiverhalten;
	protected String name;
	protected String art;
	protected int alter;
	
	public Schreiverhalten getSchreiverhalten() {
		return schreiverhalten;
	}
	public String getName() {
		return name;
	}
	public String getArt() {
		return art;
	}
	public int getAlter() {
		return alter;
	}
	
	public void schreien() {
		schreiverhalten.schreien();
	}
	
	public void feierGeburtstag() {
		this.alter++;
	}
	
	@Override
	public String toString() {
		return name + " der "  + art + ".";
	}
	
	

}
