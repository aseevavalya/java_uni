package a7_UPN;

public class Operator {
	private char op;
	
	public Operator(char op) {
		
		this.op = op;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return String.valueOf(op);
	}
	
	

}
