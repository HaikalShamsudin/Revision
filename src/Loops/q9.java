package Loops;

public class q9 {
    
    public static void main(String[] args) {
        int k = 0;
        int m = 0;

        for (int i = 0; i <= 3; i++) { // i = 
            
            k++;  // k = 
            if ( i == 2 ) {
                i = m++;
            } m++; // m = 
        }
        System.out.println(k + "," + m);
    }
}


// break - kalau i == 2, akan break, 
// continue - kalau i == 2, continue loop, 
// i = m ++
// i = 4