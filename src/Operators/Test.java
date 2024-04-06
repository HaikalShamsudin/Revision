package Operators;

public class Test {
    public static void main(String[] args) {
        
        int a = 3;
        a = ++a + a++; // 4 + 4 = 8
        System.out.println(a);
        a = --a - a--; // 7 - 7 = 0
        System.out.println(a);
    }
}
