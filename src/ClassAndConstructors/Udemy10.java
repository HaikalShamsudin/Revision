package ClassAndConstructors;

public class Udemy10 {
    
    String name;
    static int count = 0;

    public Udemy10(String name) {
        this.name = name;
        count++;
    }

    public static String getName(String a) { // method with return
        return ("saya" + " " + a);
    }

    public static void getAge (int b) { // method no return
        System.out.println(b);
    }

    public static void main(String[] args) {

    
        Udemy10 c = new Udemy10("Java Programming");
        System.out.println(c.name + ":" + count);  //count boleh akses sebab dlm class yg sama. 
                                                   // kalau class lain, kena panggil class.count -->> Udemy10.count
        String d = getName("john");
        System.out.println(d);     // from return method
        
        Udemy10 z = new Udemy10("Jack");
        // z.getAge(15);
        Udemy10.getAge(15);
        System.out.println(z.name);
    }                                              
}

