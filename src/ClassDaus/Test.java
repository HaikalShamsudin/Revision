package ClassDaus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int num[] = new int[3];
        num[1] = 10;
        num[2] = 15;
        List<Integer> lst = new ArrayList<>(3);
        lst.add(10);
        lst.add(15);
        System.out.println(num[1]);
        System.out.println();

        Random r1 = new Random(10);
        Random r2 = new Random(10); // line n1

        if (r1.nextInt(10) == r2.nextInt(10)) {
            System.out.println("Jack");
        } else {
            System.out.println("Queen");
        }
    }
}
