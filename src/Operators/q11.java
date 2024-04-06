package Operators;

public class q11 {

    public static void main(String[] args) {
        

        int i = 0;
        int j = 1;
        if((i++ == 0) && (j++ == 2)) // true && false
        {
            i = 12; //yg ni tak print. 
            
        } 
        System.out.println(i + " " + j); 
    }
}
