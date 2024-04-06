package ClassDaus;

class Kelas {

    int i = 1;
}

public class Play3 {

    static int i = 1;

    static void change (int i) {
        i = 2;
    }

    static void change (Kelas k) {
        k.i = 2;
    }

    public static int m1(int a) {
        return (i + a);
    }

    static void change (int [] i) {
        i[0] = 100;
    }

    public static void main(String[] args) {

        Kelas x = new Kelas();
        System.out.println(x.i);
        change(x);
        System.out.println(x.i); 

        System.out.println(Play3.m1(4));
    
    
        
        // int [] arr = new int[3];
        // change(27);
        // for (int i : arr) {
        //     System.out.println(i);
        // }

    }

}
