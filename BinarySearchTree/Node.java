// Russell Kosovsky 4/11/23
// Java Node class updated for BST  
public class Node {
    // INSTANCE
	private int ssn;
    private int key;
	private String name;
	private Node next;
	private Node left;
	private Node right;
	// CONSTRUCTOR
	public Node(String name, int ssn){
		this.ssn = ssn;
		this.key = ssn % 10000;
        this.name = name;
		this.next = null;
		this.left = null;
		this.right = null;
	}
	public void setSSN(int ssn){
		this.ssn = ssn;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getSSN(){
		return ssn;
	}
	public String getName(){
		return name;
	}
	public int getKey(){
		int key = ssn % 10000;
		return key;
	}
    // added set key method
	public void setKey(int num){
		this.key = num;
	}
	public void setLeft(Node left){
		this.left = left;
	}
	public void setRight(Node right){
		this.right = right;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Node getNext(){
		return next;
	}
	public Node getRight(){
		return this.right;
	}
	public Node getLeft(){
		return this.left;
	}
}

