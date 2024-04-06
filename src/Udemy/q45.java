package Udemy;

public class q45 {
    public static void main(String[] args) {
        int value = 10;
        int a = ++value;
        int b = value;
        int c = value++;

        if (a <= b && a <= c) {
            if (b <= c) {
                a = ++b;
            } else {
                a = ++c;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
