package ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        
    
        try {

            int [] s = new int[3];
            System.out.println(s[4]);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Null");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
