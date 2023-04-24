// Russell Kosovsky 3/29/2023 COM212
// Class implementing a stack using an array

public class StackA {
    
    // INSTANCE
    private Node[] stackArray;
    private int n; // size of the stack
    
    // CONSTRUCTOR
    public StackA() {
        stackArray = new Node[100];
        n = 0;
    }
    
    // returns a stack with node added as the last element
    public void push(Node node) {
        if (n == 100) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[n] = node;
        n++;
    }
    
    // returns and removes the last node of the stack
    public Node pop() {
        if (n == 0) {
            System.out.println("Stack is empty");
            return null;
        }
        n--;
        Node poppedNode = stackArray[n];
        stackArray[n] = null;
        return poppedNode;
    }
    
    // returns the last node of the stack
    public Node top() {
        if (n == 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackArray[n-1];
    }
    
    // returns true if stack is empty
    public boolean isEmpty() {
        return n == 0;
    }
    
    // printStack method for StackA
    public void printStack() {
        System.out.println(n);
        for(int i = n-1; i >= 0; i--) {
            System.out.println(stackArray[i].getKey());
        }
    }
}



