package Loops;

public class q31 {
    
    public static void main(String[] args) {
        
        boolean b = false;
        int i = 1; // i = 2
        do {
            i++; // i = 2
        } while (b = !b); // (false = true) ---->>>  akan jadi false
        System.out.println(i);
    } 
}
