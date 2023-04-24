// Russell Kosovsky 3/8/23
// Class that implements a linked list

public class LinkedList {

	// INSTANCE
	private Node head; // pointer that points to head
	private int size;  // count integer

	// CONSTRUCTOR
	public LinkedList() {  // creates an empty linked list
		head = null; 
		size = 0;
	}

	// returns number of nodes in list
	public int length() {
		return size;
	}

	// returns true if list is empty, false otherwise
	public boolean isEmptyList() {
		return size == 0;
	}

	// returns pointer to node with key value of 'key', or null if not found
	public Node searchReturn(int key) {
		Node current = head; // start at head
		while (current != null) {  
			if (current.getKey() == key) {
				return current; //return node that holds the key
			}
			current = current.getNext(); // go to next node
		}
		return null; // not found
	}

	// returns pointer to node with key value of 'key', or null if not found;
	// also removes the node from the list
	public Node searchRemove(int key) {
		Node current = head; // start at head
		Node prev = null;    // initilizes previous pointer 
		while (current != null) {  
			if (current.getKey() == key) {
				if (prev == null) { 
					head = current.getNext(); // if node that holds key is head, set head to the next node
				} else {
					prev.setNext(current.getNext()); // otherwise set the previous nodes next pointer to the current node's next node.
				}
				size--; // deincriment size
				return current; 
			}
			// if current node doesnt hold the key, move to the next node by...
			prev = current; // making the current node the previous node
			current = current.getNext(); // making the current node the node that the current node is pointing to
		}
		return null; // not found
	}

	// inserts a new node 
	public void insert(Node newNode) {
		newNode.setNext(head); // make the new node point to the node thats head
		head = newNode; //make the head pointer point to the new node.
		size++; // increment size
	}

	// prints the keys of each node of the list, in order
	public void printList() {
		Node current = head; // start at head
		System.out.println(size);
		while (current != null) {  //
			System.out.println(current.getKey()); // print key to terminal
			current = current.getNext(); // move to next node
		}
	}
}
