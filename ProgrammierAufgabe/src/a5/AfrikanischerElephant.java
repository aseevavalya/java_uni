package a5;

public class AfrikanischerElephant extends Elephant {
	
	public AfrikanischerElephant(String name) {
		super(name);
	}
	
	public void zeigeMarkenzeichen() {
		System.out.println(this.name + " wackelt mit seinen großen Ohren");
	}
	
	@Override
	public String toString() {
		return name + " der Afrikanischer Elephant";
	}
	

}
