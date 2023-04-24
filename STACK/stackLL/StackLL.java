// Russell Kosovsky 3/29/2023 COM212
// Class implementing a stack using a linked list

public class StackLL {
    
    // INSTANCE
    private Node head;

    // CONSTRUCTOR
    public StackLL() {
        head = null;
    }

    // returns true if stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // returns a stack with node added as the last element
    public void push(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }

    // returns and removes the last node of the stack
    public Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Node poppedNode = head;
        head = head.getNext();
        poppedNode.setNext(null);
        return poppedNode;
    }

    // returns the last node of the stack
    public Node top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return head;
    }

    // printStack method for StackLL
    public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
}


