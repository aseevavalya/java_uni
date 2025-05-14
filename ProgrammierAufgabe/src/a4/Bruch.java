package a4;

public class Bruch {
		
		// АТТРИБУТЫ 
		
		private int zaehler;
		private int nenner;
		
		
		// КОНСТРУКТОРЫ 
		
		Bruch (int zaehler, int nenner) {
			if (nenner == 0) {
				System.exit(0);
			}
			this.zaehler = zaehler;
			this.nenner = nenner;
			
		}
		
		// ГЕТТЕР СЕТТЕР 
		
		public int getZaehler() {	
			return zaehler;
		}
		public void setZaehler(int zaehler) {
			this.zaehler = zaehler;
		}
		public int getNenner() {
			return nenner;
		}
		public void setNenner(int nenner) {
			this.nenner = nenner;
		}
		
		// ДРУГИЕ МЕТОДЫ 
		
		public static Bruch add(Bruch b1, Bruch b2) {
			int zaehler = b1.getZaehler() * b2.getNenner() + b2.getZaehler() * b1.getNenner();
			int nenner = b1.getNenner() * b2.getNenner();
			
			return new Bruch(zaehler, nenner);
		}
		
		public double dezimal() {
			return (double) this.zaehler / (double) this.nenner;
		}
		
		//ТУ СТРИНГ 
		
		@Override
		public String toString() {
			return "(" + zaehler + "­/" + nenner + ")";
		}

}

