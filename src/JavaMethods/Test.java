package JavaMethods;

class Node {
    static final int TYPE = 100;
    public void print () {
        System.out.println(TYPE);
    }
}

public class Test {  //q15
    
    public static void main(String[] args) {
        
        Node node = new Node();
        node.print();
        
    }
}
