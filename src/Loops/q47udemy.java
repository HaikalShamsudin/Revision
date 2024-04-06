package Loops;

public class q47udemy {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        do {
            num--;
            count++;
            System.out.println(num + " " + count);
        } while (count > 1);
        System.out.println("num = " + num);
    }
}
