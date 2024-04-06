package Udemy;

public class q23 {

    static int var2 = 200;

    //method 1
    public static void print1() {
        System.out.println(var2);
    }

    //method2
    public void print (int var1) {                                     //line n1
        System.out.println(var1); // line ni print 100

        var2 = var2 + var1; //assign new value utk var2                //line n2
        print1(); // method ni dipanggil dkt main method
    }
    public static void main(String[] args) {
        q23 obj = new q23();
        obj.print(100); // ni panggil method 2
    }
}
