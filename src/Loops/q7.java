package Loops;

public class q7 {
    
    public static void main(String[] args) {

        int i = 0;
        for (i = 1; i < 5; i++) continue; 
        for (i = 0;  ; i++) break; // line ni, iterates sekali je i = 0, sebab dia takda condition
        for (  ; i<5 ? false:true;   );  // yang ni tak execute, sebab condition dia false
        
        // at the end, value i = 0
    }
}
