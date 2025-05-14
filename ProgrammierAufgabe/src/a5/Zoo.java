package a5;

public class Zoo {

	public static void main(String[] args) {
		Tier[] tiere = new Tier[4];
		
		tiere[0] = new Elephant("Dumbo");
		tiere[1] = new AfrikanischerElephant("Tembo");
		tiere[2] = new Tiger("Raikou");
		tiere[3] = new Wolf("Donnel");
		
		for(Tier tier : tiere) {
			System.out.println(tier.toString());
			tier.schreien();
			
			if (tier instanceof Tiger) {
				System.out.println("Tiger sind schneller als Löwen");
			}
			
			if (tier instanceof Elephant) {
				((Elephant)tier).stampfen();
				
			}
			
			if (tier instanceof AfrikanischerElephant) {
				((AfrikanischerElephant)tier).zeigeMarkenzeichen();
			}
			
		}
		
	}

}
