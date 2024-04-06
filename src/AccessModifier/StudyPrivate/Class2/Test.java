package AccessModifier.StudyPrivate.Class2;

import AccessModifier.StudyPrivate.Class1.ClassPrivate;

//Question: how to get the output value = 100? - using getter method
//Question: how to get the output value = 100 + 50 = 150? - constructor

public class Test {
    public static void main(String[] args) {
        
        ClassPrivate c = new ClassPrivate();
        System.out.println("Value = " + c.getValue());

        ClassPrivate cp = new ClassPrivate(50);
        System.out.println("Value = " + cp.getValue());

    }
}
