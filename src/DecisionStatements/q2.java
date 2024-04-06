package DecisionStatements;

public class q2 {

    public static int switchTest (int k) {
        int j = 1;
        switch(k) {
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++; // j start increases kat sini, sebab switch (k=4)
            case 5: j++;
            default : j++; // & then sampai sini jadi j = 4
        }
        return j + k; // j = 4 tambah  k = 4
    }
    public static void main(String[] args) {
        System.out.println(switchTest(4));
    }
}
