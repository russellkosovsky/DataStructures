// Russell Kosovsky 3/1/23
// Node Class with methods to get and set the different fields

public class Node {

	// INSTANCE
	private String name;
	private int ssn;
	private Node next = null;

	// CONSTRUCTOR
	public Node(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameInput) {
		this.name = nameInput;
	}

	public int getSSN() {
		return ssn;
	}

	public void setSSN(int ssnInput) {
		this.ssn = ssnInput;
	}

	public int getKey() {
		int key = ssn % 10000;
		return key;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
}
