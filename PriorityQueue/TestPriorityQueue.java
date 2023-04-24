public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // Test createEmptySet()
        pq.createEmptySet();
        System.out.println();
        System.out.println("Priority queue created --- isEmptySet == " + (pq.isEmptySet()));
        System.out.println();

        // Test insert()
        System.out.println("---------------------------------------- Inserting Nodes: \nRussell:12345(6694) \nBrooke:23456(7747) \nMiles:34567(8860) \nJim:45678(9925)");
        pq.insert(new Node("Russell", 123456694));
        pq.insert(new Node("Brooke", 234567747));
        pq.insert(new Node("Miles", 345678860));
        pq.insert(new Node("Jim", 456789925));
        System.out.println();

        // Test findMin()
        Node minNode = pq.findMin();
        if (minNode != null) {
            System.out.println("Minimum key (findMin()): " + minNode.getKey());
        }
        System.out.println();

        // Test deleteMin()
        pq.deleteMin();
        minNode = pq.findMin();
        if (minNode != null) {
            System.out.println("Minimum key after deleteMin(): " + minNode.getKey());
        }
        System.out.println();

        // Test insert()
        System.out.println("---------------------------------------- Inserting Nodes: \nGary:12345(1134) \nLiam:12345(2268)");
        pq.insert(new Node("Gary", 123451134));
        pq.insert(new Node("Liam", 234562268));
        System.out.println();

        // Test findMin()
        Node newMinNode = pq.findMin();
        if (newMinNode != null) {
            System.out.println("Minimum key (findMin()): " + newMinNode.getKey());
        }
        System.out.println();

        // Test deleteMin()
        pq.deleteMin();
        newMinNode = pq.findMin();
        if (minNode != null) {
            System.out.println("Minimum key after deleteMin(): " + newMinNode.getKey());
        }
        System.out.println();

        // Test isEmptySet()
        pq.createEmptySet();
        System.out.println("---------------------------------------- pq.createEmptySet():");
        System.out.println();
        System.out.println("Priority queue after emptying --- isEmptySet == " + (pq.isEmptySet()));
        System.out.println();	

        // Test error messages
        System.out.println();
        System.out.println("-------------------- Testing error cases -------------------- ");
        System.out.println();
        System.out.println();
        
        System.out.println("---------------------------------------- pq.deleteMin():");
        System.out.println();
        pq.deleteMin(); // Error: Priority queue is empty
        System.out.println();
        
        System.out.println("---------------------------------------- findMin():");
        System.out.println();
        pq.findMin(); // Error: Priority queue is empty
        System.out.println();
        
        //loop to add the max num of nodes (121)
        System.out.println("---------------------------------------- Inserting 121 nodes (max of 120):");
        System.out.println();
        for (int i = 0; i <= 120; i++) {
            pq.insert(new Node("Node" + i, i));
        } // Error: Priority queue is full
        System.out.println();
    }
}

