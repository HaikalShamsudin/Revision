package DataTypes;

public class Test {
    
    

    public static void main(String[] args) {
        
        // int i = 10;
        // byte b = 20;
        // char c = i;
        
        // // i = b;

        // double d = 1.0;
        // float f = 1.0f;

        // int i = 1;
        // long l = 1;

        // byte b = 1;
        // b = b + 1; // kena casting manual (byte)
        // b++;     //auto casting
        // b += 1; //auto casting


        float fvalue = 120;
        int iValue = fvalue; // error sebab int lebih kecik dari float
        double dValue = fvalue; // boleh sebab double lagi besar dri float
        long lValue = fvalue; // error sebab long lagi kecik dari float

        char c = 1;

        System.out.println(c);

        // float f5 = 0x0123;
        
        System.out.println("" + 2 + 3 * 5);
        
    }
}
