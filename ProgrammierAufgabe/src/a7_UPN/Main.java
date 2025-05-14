package a7_UPN;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Object> upn = new ArrayList<Object>();
		
		upn.add(new Operand(5));
		upn.add(new Operand(3));
		upn.add(new Operator('*'));
		upn.add(new Operand(2));
		upn.add(new Operator('+'));
		
		UpnAuswerter auswerter = new UpnAuswerter();
		
		System.out.println(auswerter.auswerten(upn));

	}

}
