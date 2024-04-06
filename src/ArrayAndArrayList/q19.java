package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class q19 {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        @SuppressWarnings("rawtypes")
        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");  
        s1.add(1,"c"); // kat sini, masukkan element "c" diantara element "a" dan "b"
        // so arraylist dah jadi {a,c,b}

        @SuppressWarnings("rawtypes")
        List s2 = new ArrayList(s1.subList(1, 1)); 
        s1.addAll(s2);
        System.out.println(s1);
    }
}
