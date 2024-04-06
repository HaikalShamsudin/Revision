package ArrayAndArrayList;

public class Example1 {
    
    double balance;
    public void update (int[] balances2) { 
        balances2[0] = 100; 
        balances2[1] = 200;
    }

    public static void main(String[] args) {
        
        int[] balances1 = new int [2];
        balances1 [0] = 10;
        balances1 [1] = 20;
        for (int bal : balances1) {
            System.out.println(bal + " ");
        }

        Example1 e = new Example1(); 
        e.update(balances1); // line ni, attributes pada balances2 diupdate ke balances1
        for (int bal : balances1) {  //read balik balances1
            System.out.println(bal + " ");  // new output for balances 1
        }
    }

}
