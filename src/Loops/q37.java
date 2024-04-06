package Loops;

public class q37 {

    public static void main(String args[]) {
        char i;
        LOOP: for (i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");
            }
        }  /* dia akan print C E F

        kena tahu, dalam ni : 
        1. char
        2. i ++ dia delay 
        3. dia terus print case 2, 
        
        masa for loop i = 1, switch i masih = 0 */
    }

}
