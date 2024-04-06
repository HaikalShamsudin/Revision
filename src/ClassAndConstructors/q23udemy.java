package ClassAndConstructors;

public class q23udemy {
    static int var2 = 200;
    public static void print() {
        System.out.println("hey" + " " + var2);
    }
    public void print (int var1) {          //line n1
        System.out.println("hai" + " " + var1);
        var2 = var2 + var1;                 //line n2
        print();
    }
    public static void main(String[] args) {
        q23udemy obj = new q23udemy();
        obj.print(100); 
        

        
    }
}
