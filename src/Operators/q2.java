package Operators;

public class q2 {
    
    public static int m1 (int i) {
        return ++i;
    }

    public static void main(String[] args) {
        
        int k = m1(args.length);
        System.out.println(k);
        k += 3 + ++k;
        System.out.println(k);
    }
}
