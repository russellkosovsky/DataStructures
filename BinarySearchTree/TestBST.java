// Russell Kosovsky(Prof. Parker's) 4/11/23
// Updated Test class for BST

public class TestBST {
    public static void main(String[] args){
        BST a = new BST();
        System.out.println("isEmptyTree = " + a.isEmptyTree());
        
        Node xNode = new Node("Jane", 123456789);
        Node yNode = new Node("Joe", 934567890);
        Node zNode = new Node("Jack", 223452234);
        Node kNode = new Node("Jill", 934567856);
        Node aNode = new Node("Abe", 123456788);
        Node mNode = new Node("Mike", 723452237);
        Node nNode = new Node("Nick", 734567857);
        Node oNode = new Node("Otis", 734562222);
        a.insert(xNode);
        a.insert(yNode);
        a.insert(zNode);
        a.insert(kNode);
        a.traverse();
        a.printTree();
        a.insert(mNode);
        a.insert(nNode);
        System.out.println("search");
        System.out.println(a.search(6789).getName());
        System.out.println(a.search(7890).getName());
        System.out.println(a.search(2234).getName());
        System.out.println(a.search(7856).getName());
        a.traverse();
        a.printTree();
        System.out.println("searchFor 7890");
        System.out.println(a.search(7890).getName());
        System.out.println("delete6789");
        a.delete(xNode);
        a.traverse();
        a.printTree();
        System.out.println("delete2237");
        a.delete(mNode);
        a.traverse();
        a.printTree();
        System.out.println("delete7857");
        a.delete(nNode);
        a.traverse();
        a.printTree();
        System.out.println("insert6788");
        a.insert(aNode);
        a.traverse();
        a.printTree();
        System.out.println("insert2222");
        a.insert(oNode);
        a.traverse();
        a.printTree();
        System.out.println("delete2234");
        a.delete(zNode);
        a.traverse();
        a.printTree();
        System.out.println("isEmptyTree = " + a.isEmptyTree());
        System.out.println("insert2234");
        a.insert(zNode);
        a.traverse();
        a.printTree();
    }
}

