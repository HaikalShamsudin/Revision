package ClassAndConstructors;

public class q2 {

    // int a;
    // int b;

    //attributes
    static int someInt = 10; //attribute

    //constructor
    public q2(int a, int b){
        // a = 5;
        // b = 5;
    }

    //method
    public static void changeIt (int a) { //method
            a = 20;
            // System.out.println(20);
        }

    public static void main(String[] args) {
        
        
        // changeIt(someInt);
        q2 que = new q2(5, 5);
        q2 q = new q2(6, 7);
        // que.changeIt();
        System.out.println(que.a + que.b);
        System.out.println(q.a + q.b);
        // System.out.println(someInt);
    }

}
