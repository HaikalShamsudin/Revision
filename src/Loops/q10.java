package Loops;

public class q10 {

    public static void main(String[] args) {

        int count = 0, sum = 0;

        do {
            if (count % 3 == 0)  // count = , 
                continue;
            sum += count; //kalau statement jadi true, akan skip ni    // sum = 
        } while (count++ < 11); //count = 
        System.out.println(sum);
    }
}

// nilai count bahagia dengan 3, adakah sama dengan 0? --->>> line 10