package DataTypes;

public class StringData {
    public static void main(String[] args) {

        String s1 = "Hello Java";
        String s2;
        System.out.println(s1.length());

        // s.concat("SE 8"); // ni takkan function sbb string immutable

        s2 = s1.concat("SE 8"); // ni create new object, new memory location, and dapat tambahkan dalam hello java
        // String s2 = new String(); // ni create new object 
        // System.out.println(s.length());
        System.out.println(s1 == s2); //compare memory location
    }
}
