package a7_UPN;

import java.util.ArrayList;
import java.util.List;

public class ListStack implements IStack {
	
	private List<Object> stack = new ArrayList<Object>();

	public ListStack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void push(Object obj) {
		stack.add(obj);

	}

	@Override
	public Object peek() {
		return stack.get(stack.size() - 1);
	}

	@Override
	public Object pop() {
		return stack.remove(stack.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
