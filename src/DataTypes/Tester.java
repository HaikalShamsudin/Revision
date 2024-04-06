package DataTypes;

public class Tester {
    
    public static void main(String[] args) {
        
        String str = null;
        char arr[] = {'h','e','l','o'};
        System.out.println(str.length());

        for (char c : arr) {
            str += c;
        }

        // System.out.println(str);
        System.out.println(str.length());
    }
}
