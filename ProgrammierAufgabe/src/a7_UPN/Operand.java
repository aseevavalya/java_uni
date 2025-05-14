package a7_UPN;

public class Operand {
	
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Operand(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
	
	

}
