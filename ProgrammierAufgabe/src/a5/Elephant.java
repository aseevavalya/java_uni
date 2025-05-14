package a5;

public class Elephant extends Tier {
	public Elephant(String name) {
		this.name = name;
		this.art = "Elephant";
		this.schreiverhalten = new Troeten();
	}
	
	public void stampfen() {
		System.out.println("Wenn er auf den Boden stampft, erzittert die Erde");
	}
	

}
