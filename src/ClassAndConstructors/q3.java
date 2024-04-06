package ClassAndConstructors;

public class q3 {

    long l1;
    
    public q3(long pLong) {
        l1 = pLong;
    }
    public static void main(String[] args) {
        
        q3 a = new q3(6);
        q3 b = new q3(5);
        System.out.println(a.l1);
        System.out.println(b.l1);
    }
}
