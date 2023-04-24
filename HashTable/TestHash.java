// Russell Kosovsky 4/18/23
// Test Class for my HashTable java implementation
public class TestHash {
    public static void main(String[] args) {

        HashTable ht = new HashTable(7);
        System.out.println("Hash table empty: " + ht.isEmptyHash());

        ht.add(new Node("Russell", 123459789));
        ht.add(new Node("Jim", 123456694));
        ht.add(new Node("Gary", 123456723));

        System.out.println("\nHash table after first insertions:");
        ht.printTable();
        
        System.out.println("\nRemoving 6694:");
        ht.remove(6694);
        System.out.println("Hash table empty: " + ht.isEmptyHash());
        System.out.println("\nLooking up 9789: " + ht.lookUp(9789).getName());
        ht.printTable();

        ht.add(new Node("Brooke", 123451694));
        ht.add(new Node("Miles", 123456505));
        ht.add(new Node("JohnPork", 969696969));

        System.out.println("\nHash table after second insertions:");
        System.out.println("\nLooking up key 6969: " + ht.lookUp(6969).getName());
        ht.printTable();

        System.out.println("\nRemoving 6505:");
        ht.remove(6505);
        System.out.println("\nPrinting HashTable:");
        ht.printTable();     
        
        System.out.println("\nInserting 9630:");
        ht.add(new Node("Bertha", 845389630));
        System.out.println("\nPrinting HashTable:");
        ht.printTable();        
        
        System.out.println("\nRemoving 1694:");
        ht.remove(1694);        
        System.out.println("\nPrinting HashTable:");
        ht.printTable();
        
        System.out.println("\nEmptying HashTable................................");
        HashTable HT = new HashTable(7);
        System.out.println("Hash table empty: " + HT.isEmptyHash());
        System.out.println("\nPrinting HashTable:");
        HT.printTable();
        
        System.out.println("\nInserting 1927 as 'RUSSELL'");
        HT.add(new Node("RUSSELL", 111119354));
        System.out.println("\nPrinting HashTable:");
        HT.printTable();
        
        System.out.println("\nInserting 9354 as 'MILES'");
        HT.add(new Node("MILES", 111119354));
        System.out.println("\nPrinting HashTable:");
        HT.printTable();
        
        System.out.println("\nInserting 1927 as 'BROOKE'");
        HT.add(new Node("BROOKE", 111111927));
        System.out.println("\nPrinting HashTable:");
        HT.printTable();
        
        System.out.println("\nInserting 9354 as 'SUZIE'");
        HT.add(new Node("SUZIE", 111119354));
        System.out.println("\nPrinting HashTable:");
        HT.printTable();

    }
}

