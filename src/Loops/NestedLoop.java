package Loops;

public class NestedLoop {
    public static void main(String[] args) {
        
        loop1 : for (int i = 0; i < 2; i++) {
            
            loop2 : for (int j = 0; j < 2; j++) {
                
                loop3 : for (int k = 0; k < 2; k++) {
                    
                    System.out.println(k);
                    continue loop2;
                }
            }
        }
    }
}

