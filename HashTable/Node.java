// Russell Kosovsky 3/1/23
// Node Class with methods to get and set the different fields

public class Node {
	// INSTANCE
    private String name;
    private int key;
    private Node next = null;
	// CONSTRUCTOR
    public Node(String name, int ssn) {
        this.name = name;
        this.key = ssn % 10000;
    }
    public String getName() {
        return name;
    }
    public void setName(String nameInput) {
        this.name = nameInput;
    }
    public void setKey(int keyInput) {
        this.key = keyInput;
    }
    public int getKey() {
        return key;
    }
    public void setNext(Node next) {
        this.next = next;
    }	
    public Node getNext() {
        return next;
    }
}
