// Russell Kosovsky 3/10/23
// Priority Queue(min heap) implementation using an array of nodes

public class PriorityQueue {
    // Instance
    private Node[] heap;
    private int size;
    
    //Helper function to access parents/children
    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Constructor
    public PriorityQueue() {
        heap = new Node[120];
        size = 0;
    }

    public boolean isEmptySet() {
        return size == 0;
    }

    public void createEmptySet() {
        size = 0;
    }

    public void insert(Node node) {
        if (size == heap.length) {
            System.out.println("Error: Priority queue is full");
            return;
        }

        int index = size;
        size++;

        while (index > 0 && heap[parent(index)].getKey() > node.getKey()) {
            heap[index] = heap[parent(index)];
            index = parent(index);
        }

        heap[index] = node;
    }

    public Node findMin() {
        if (isEmptySet()) {
            System.out.println("Error: Priority queue is empty");
            return null;
        }

        return heap[0];
    }

    public void deleteMin() {
        if (isEmptySet()) {
            System.out.println("Error: Priority queue is empty");
            return;
        }

        heap[0] = heap[size - 1];
        size--;

        heapify(0);
    }

    private void heapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int min = index;

        if (left < size && heap[left].getKey() < heap[index].getKey()) {
            min = left;
        }

        if (right < size && heap[right].getKey() < heap[min].getKey()) {
            min = right;
        }

        if (min != index) {
            swap(index, min);
            heapify(min);
        }
    }

    private void swap(int i, int j) {
        Node temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

