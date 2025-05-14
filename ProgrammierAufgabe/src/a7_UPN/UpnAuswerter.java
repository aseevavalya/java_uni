package a7_UPN;

import java.util.List;

public class UpnAuswerter {
	
	public int auswerten(List<Object> upn) {
		ListStack stack = new ListStack();
		
		if (upn.isEmpty()) {
			System.out.println("Liste is leer");
			return -1;
		}
		
		for (Object obj : upn) {
			if (obj instanceof Operand) {
				stack.push((Operand) obj);
			} else if(obj instanceof Operator) {
				Operator operator = ((Operator)obj);
				if(operator.getOp() == '+' || operator.getOp() == '-' || operator.getOp() == '*') {
					
					int right = 0;
					if (!stack.isEmpty()) {
						right = ((Operand) stack.pop()).getValue();
					} else {
						System.out.println("Ausdruck ist ungültig");
						return -1;
					}
					
					int left = 0;
					if (!stack.isEmpty()) {
						left = ((Operand) stack.pop()).getValue();
					} else {
						System.out.println("Ausdruck ist ungültig");
						return -1;
					}
					
					switch (operator.getOp()) {
					case '+':
						stack.push(new Operand(left+right));
						break;
					case '-':
						stack.push(new Operand(left-right));
						break;
					case '*':
						stack.push(new Operand(left*right));
						break;
					
					default:
						break;
					
					}
					
				} else {
					System.out.println("Operator ungultig");
					return -1;
				}
			} else {
				System.out.println("Ungültiger Ausdruck");
				return -1;
			}
		}
		
		int ergebnis = ((Operand)stack.pop()).getValue();
		
		if (stack.isEmpty()) {
			return ergebnis;
		} else {
			System.out.println("Ungültige Eingabe");
			return -1; 
		}

	}
	
	

}
