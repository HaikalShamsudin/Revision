package Loops;

public class q14 {
    
    static int [] data = {1,2,3,4,5};

    public static void main(String[] args) {
        for (int i : data) {   // i = 2
            if (i < 2) {
            continue;  // continuue maksudnya continue loop
          } System.out.println(i);
          if (i == 3) {  // i = 2
            // continue;
          }
        } 
    }
}
