package Loops;

public class q32 {
    public static void main(String[] args) {
        int var = 20, i = 0;
        do {
            while (true) {
                if (i++ > var) break;
            }
        } while (i < var--);
        System.out.println(var);
    }
}

/*When the first iteration of outer do-while loop starts, var is 20. 
Now, the inner loop executes till i becomes 21. Now, the condition for 
outer do-while is checked, while( 22 < 20 ), [i is 22 because of the 
last i++>var check], thereby making var 19. And as the condition is false, 
the outer loop also ends. So, 19 is printed. */