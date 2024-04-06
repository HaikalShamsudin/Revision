package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class q69udemy {
    public static void main(String[] args) {
        int num[] = new int[3];
        num[0] = 3;
        num[1] = 10;
        num[2] = 15;
        List<Integer> lst = new ArrayList<>(3);
        lst.add(10);
        lst.add(15);
        
        System.out.println(num[1]); // tetap akan print memory location. kalau nak print value, masukkan index
        System.out.println(lst.get(1)); //kalau nak print specific list, buat lst.get()
    }
}
