package ClassDaus;

import java.util.ArrayList;
import java.util.List;

public class Playground3 {
    
    // Wrapper class
    // 1. Autoboxing (automatic conversion from primitive to wrapper and vice versa)
    // 2. Purpose
    // 3. String (not a wrapper)
    // 4. Method 

    public static void main(String[] args) {
        
        // Double d1 = 1.0;  //references type
        // Float f = 1.0f;

        // Long l = 1l;
        // Short s = 1;

        // double d2 = 1;
        
        int i = 1;
        // int j = 5;
        int arr[] = {i};
        for (int elm : arr) {System.out.println(elm);}

        List <Double> list = new ArrayList<>();

        list.add (new Double (1.0f) );
        // // int [] arr = new int [3];
        // list.add(i);
        // // list.add(5);
        // for (Integer elm : list ) {System.out.println(elm);}

        
    }
}
