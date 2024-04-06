package Loops;

public class q12 {
    public static void main(String[] args) {
        
        int i = 0, j = 11;
        
        do {
            if (i>j) { break; }   
            j--;                // j = 6
        }while ( ++i < 5 );      // i = 5
        System.out.println(i+" "+j);
    }
}
