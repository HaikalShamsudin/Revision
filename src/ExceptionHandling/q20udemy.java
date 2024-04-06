package ExceptionHandling;

public class q20udemy {
    public static void main(String[] args) {
        int[] arr = {10,0};
        int i = 0;
        try {
            int answer = arr[i] / arr[i + 1];
            System.out.println(answer);
        } catch (ArithmeticException e) {
            System.out.println("Unknown issues.");
        } catch (Exception ae) {
            System.out.println("Invalid divisor");
        }
     }
}
