// Russell Kosovsky 3/1/23
// Node Class with methods to get and set the different fields
// Collaborated with Brooke in class

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

	// Returns Name
	public String getName() {
		return name;
	}

	// Changes the name in a node
	public void setName(String nameInput) {
		this.name = nameInput;
	}

	// Returns ssn
	public int getSSN() {
		return ssn;
	}

	// Changes the ssn in a node
	public void setSSN(int ssnInput) {
		this.ssn = ssnInput;
	}

	// Returns the last 4 digits of a nodes ssn
	public int getKey() {
		int key = ssn % 10000;
		return key;
	}

	// Constructs pointer that can be used to point to the "next" node
	public void setNext(Node next) {
		this.next = next;
	}
	
	// Returns the node that a given node is pointing to
	public Node getNext() {
		return next;
	}
}
