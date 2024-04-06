package ClassDaus;

public class Play2 {
    
    // String m1 (int i) {
    //     System.out.println("integer");
    //     return " ";
    // }

    void m1 (double... apiz) {
        System.out.println(apiz[1]);
    }

    void m2 (double[] apiz) {
        System.out.println(apiz[1]);
    }

    public static void main(String... args) {
        
        Play2 p = new Play2();
        p.m1(1,2,3);

        p.m2(new double[] {1,2,3});
    }
}
