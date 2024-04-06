package JavaMethods;

public class q55udemy {
    
        int c = 5;
        static void modify (q55udemy test) {
            test.c = 99;
        }
     
        public static void main(String[] args) {
            final q55udemy tf = new q55udemy();
            modify(tf);
            System.out.println(tf.c);
        }

    
}
