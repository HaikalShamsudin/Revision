package Loops;

public class Pening {
    
    int max(int x, int y) { 
        if (x > y) return x; return y; 
    }


    public static void main(String[] args) {
        
        int z = 0;
        Pening pen = new Pening();
        z = pen.max(1, 5);
        System.out.println(z);

        
    }
}

