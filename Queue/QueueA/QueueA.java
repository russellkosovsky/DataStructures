// Russell Kosovsky 4/4/23
// Queue class implementation using an array

public class QueueA {
    
    private Node[] q;
    private int front, rear, n;

    public QueueA() {
        q = new Node[100];
        front = rear = n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public Node front() {
        if (isEmpty()) return null;
        return q[front];
    }

    public void enqueue(Node x) {
        if (n == q.length) {
            System.out.println("Queue overflow");
            return;
        }
        q[rear] = x;
        rear = (rear + 1) % q.length;
        n++;
    }

    public Node dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return null;
        }
        
        Node x = q[front];
        q[front] = null;
        front = (front + 1) % q.length;
        //deincrement
        n--;
        return x;
    }

    // printQueue method for QueueA
    public void printQueue() {
        int tail = (front + n) % 100;
        System.out.println(front);
        System.out.println(tail);
        if (front <= tail)
           for(int i = front; i < tail; i++) 
               System.out.println(q[i].getKey());
        else {
           for(int i = front; i < 100; i++) 
               System.out.println(q[i].getKey());          
           for(int i = 0; i < tail; i++) 
               System.out.println(q[i].getKey());
        }          
    }
}

