package ClassAndConstructors;

public class q5 {
    
    int value = 1;
    q5 link;

    //constructor
    public q5 (int val) {
        this.value = val;
    }

    public static void main(String[] args) {
        
        final q5 a = new q5(5); //create an obj
        q5 b = new q5(10); // create an obj
        a.link = b;
        b.link = setIt(a, b);
        System.out.println(a.link.value + "  " + b.link.value);
    
    }

    //method
    public static q5 setIt (final q5 x, final q5 y) {
        x.link = y.link;
        return x;
    }
}
