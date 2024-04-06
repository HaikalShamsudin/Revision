package JavaMethods;

import java.util.Random;

public class q70udemy {
    public static void main(String[] args) {
        Random r1 = new Random();
        Random r2 = new Random(); // line n1

        if (r1.nextInt() == r2.nextInt()) {
            System.out.println("Jack");
        } else {
            System.out.println("Queen");
        }
    }
}
