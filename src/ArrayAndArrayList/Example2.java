package ArrayAndArrayList;

public class Example2 {
    
    double balance;
    public void update (int[] balances) {
        for (int bal : balances) {
            bal = 100; // this line try untuk modify, tapi takkan effect apa-apa
        }
    }

    public static void main(String[] args) {
        
        int[] balances = new int [2];
        balances [0] = 10;
        balances [1] = 20;
        for (int bal : balances) {
            System.out.println(bal + " ");
        }

        Example2 e = new Example2(); 
        e.update(balances); 
        for (int bal : balances) {  
            System.out.println(bal + " ");  
        }
    }
}
