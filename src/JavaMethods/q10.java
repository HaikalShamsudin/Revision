package JavaMethods;

public class q10 {
    
    public int update (int a, int offset) {
        a = a + offset;
        return a;
    }

    public static void main(String[] args) {
        
        int a = 99;

        q10 u = new q10();
        // u.update(a, 111);
        // a = u.update(a, 111);
        System.out.println(u.update(a, 111));


    }
}
