package StringClass;

public class q41udemy {
    public static void main(String[] args) {
        String digits = "0123456789";
        System.out.println(
                digits.substring(
                        digits.indexOf("4"), digits.indexOf("8")).concat("89")); //kat sini dia buat new memory location
                        System.out.println(digits);
    }
    
}
