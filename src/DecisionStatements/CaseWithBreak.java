package DecisionStatements;

public class CaseWithBreak {
    public static void main(String[] args) {

        int x = 1;

        for (int j = 0; j < 1; j++) {

            switch (x) {
                case 1:
                    if (x < 10) {break;}
                default:
                    System.out.println("default");
                    break;
            }
            System.out.println("inside loop");
        }
        System.out.println("outside loop");
    }
}
