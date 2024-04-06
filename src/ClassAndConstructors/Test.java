package ClassAndConstructors;

public class Test {
    
    //shadow variable.

    //panggil static, pakai class

    static int nombor = 2;

    public static void main(String[] args) {
        
        int nombor = 5;
        System.out.println(nombor); // panggil local variable
        System.out.println(Test.nombor); // panggil static variable
    }

}
