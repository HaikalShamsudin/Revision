package Loops;

public class q17 {
    
    static int m = 10, n = 20;   // tak pakai pun yg ni

    public static void main(String[] args) {
        int m = 0, n = 10;  // m = 3
        q17 mb = new q17();
        while (m<3) {    // while loop akan pakai local variable sebab m & n defined in main() 
            m++; n--; // m = 3     
        }             // n = 7
        System.out.println(m + " " + n);
    }
}
