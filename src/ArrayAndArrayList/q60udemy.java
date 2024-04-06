package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class q60udemy {
    public static void main(String[] args) {
        List<String> fls = new ArrayList<>();
        fls.add("jasmine");
        fls.add("rose");
        fls.add("lotus");
        fls.remove("lotus");
        fls.add(2, "lily");
        System.out.println(fls);
    }
}
