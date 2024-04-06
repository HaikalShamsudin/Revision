package Loops;

public class q4 {
    
    public static void main(String[] args) {
        
        int counter = 0;
        
        outer: for (int i = 0; i < 3; i++) {  // i = 2

            middle: for (int j = 0; j < 3; j++) { // j = 0 //takkan loop j ni banyak kali sbb ada break middle

                inner: for (int k = 0; k < 3; k++) { // k = 1
            
                    if (k-j>0) break middle; // ni maksud dia skip middle
                    counter++;  // counter = 3
                }
                System.out.println(counter); // lepas i = 3, line ni execute
            }
        }
    }
}
