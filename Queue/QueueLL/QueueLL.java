// Russell Kosovsky 4/4/23
// Queue class implementation using a linked list

public class QueueLL {
    private Node head;
    private Node tail;
    private int size;

    public QueueLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(Node newNode) {
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public Node dequeue() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

    public Node front() {
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // printQueue method for QueueLL
    public void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
}

