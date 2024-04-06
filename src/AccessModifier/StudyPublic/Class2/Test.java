package AccessModifier.StudyPublic.Class2;

import AccessModifier.StudyPublic.Class1.Class;

//Question: how to get the output value = 100?

class NewClass extends Class {
}


public class Test {
    

    public static void main(String[] args) {
        
        NewClass newclass = new NewClass();
        System.out.println("Value = " + newclass.value);

    }
}
