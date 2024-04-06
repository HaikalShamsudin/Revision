package Loops;

public class q2 {
    public static void main(String[] args) {
        
        int c = 0;

        A: for (int i = 0; i < 2; i++) { // i = 1

            B: for (int j = 0; j < 2; j++) { // j = 1
    
                C: for (int k = 0; k < 3; k++) { // k = 2
                    System.out.println(c + "haha");
                    c++;                                            // c = 10
                    if (k>j) break;
                }
            }
        }
        System.out.println(c + "oh ok");
    }
}
