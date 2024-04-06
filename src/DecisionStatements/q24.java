package DecisionStatements;

public class q24 {
    
    public static void main(String[] args) {
        
        int k = 9, s = 5;
        switch(k) {
            default:
            if (k == 10) { s = s*2; } // kalau ni true, akan print case 7
            else {
                s = s + 4; // kalau false, ia akan print ni
                break;
            }
            case 7 : s = s + 4;
        }
        System.out.println(s);
    }
}
