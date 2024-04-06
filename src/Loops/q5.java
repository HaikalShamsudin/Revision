package Loops;

public class q5 {
    
    public static void main(String[] args) {
        
        String [] sa = {"a", "b", "c"};
        for (String s : sa) { // s = sa = s akan jadi a, b dan c
            if ("b".equals(s)) continue;  
            System.out.println(s);
            if("b".equals(s)) break;
            System.out.println(s + " again");
        }
    }
}
