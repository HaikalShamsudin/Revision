package Loops;

public class q23 {
    

    public static void main(String[] args) {
        int i = 0, j = 5;  
        lab1 : for (  ;  ;  i++) {   
            System.out.println(i);
            for (   ;  ; --j) if ( i>j ) break lab1;
            
            
        }
        System.out.println("i = " + i + ", j =" + j);
    }
}

// value i tak naik. just value j yg turun sampai i>j