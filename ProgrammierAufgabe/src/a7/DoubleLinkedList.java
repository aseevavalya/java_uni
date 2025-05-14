package a7;

public class DoubleLinkedList<T> implements List<T>{
	
	private Node<T> head;
	private Node<T> last;
	private int length;
	
	public DoubleLinkedList() {
	    this.head = null;
	    this.last = null;
	    this.length = 0;
	    
	    
	}
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getLast() {
		return last;
	}

	public void setLast(Node<T> last) {
		this.last = last;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	

	@Override
	public void add(T obj){		
		
		Node<T> newNode;
		
		if (head == null) {
			newNode = new Node<T>(obj, null, null);
			head = newNode;
			last = newNode;
		} else {
			newNode = new Node<T>(obj);
			last.setNext(newNode);
			newNode.setPrev(last);
			newNode.setNext(null);
			last = newNode;
		}
		
		length++;
		
		
	}

	@Override
	public void insert(T obj, int index) {
		
		// Vorn einfügen
		if (index == 0) {
			
		} else if (index == length - 1) {
			add(obj);
		} else if (index < length - 1 && index > 0) {
			
		} else {
			//Fehler, weil falsch index 
		}
		
		
	}

	@Override
	public T get(int index) {
		
		
		
	}

	@Override
	public void delete(int index) {
		
		
		
	}

	@Override
	public int indexOf(T obj) {
		
		
		
		return null;
	}
	
	@Override
	public int length() {
	    
	    
	    
		return null;
	}
	
	@Override
	public boolean equals(Object obj){
		
		
		
		return null;
	}
	
	@Override
	public String toString() {		
		
		
		
		return null;		
	}
	
	class Node<T> {
		
		private T content;
		private Node<T> prev;
		private Node<T> next;
		
		public Node(T content) {
			this.content = content;
			this.prev = null;
			this.next = null;
		}
		
		public Node(T content, Node<T> prev, Node<T> next) {
			this.content = content;
			this.prev = prev;
			this.next = next;
		}
		
		public T getContent() {
			return content;
		}
		
		public void setContent(T content) {
			this.content = content;
		}
		
		public Node<T> getNext() {
			return next;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
		public Node<T> getPrev() {
			return prev;
		}
		
		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}	
		
		@Override
		public String toString() {
		    return content.toString();
		}
		
		public boolean equals(Node<T> node) {
			return this.content.equals(node.getcontent());
		}
	}
}
