package JavaBasic;

public class Test {
    
    public static void main(String[] args) {
        
        String a = "java";
        // String b = "java";
        String b = new String("java"); // create another memory location

        if (a.equals(b)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
