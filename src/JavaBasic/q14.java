package JavaBasic;

public class q14 {                  // question: what will be printed when run      java q14 1 2 3 4
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(args); // kalau args shj, akan print location
            System.out.println(args[2]); // kalau print args [], akan print content
        }
    }
}


