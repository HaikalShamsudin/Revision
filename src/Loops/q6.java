package Loops;

public class q6 {
    
    public void loopTest (int x) {
        loop: for (int i = 1; i < 5; i++) { // i = 1

            for (int j = 1; j < 5; j++) { // j = 1

                System.out.println(i); // i = 1

                if (x == 0) { continue loop; }

                System.out.println(j); 
            }
        }
    }
}
