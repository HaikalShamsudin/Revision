package AccessModifier.StudyProtected.Kelas2;

import AccessModifier.StudyProtected.Kelas1.Kelas;

//Question: how to get the output value = 100?
//Question: how to get the updated output value = 50?

class KelasBaru extends Kelas {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}   // di sini, access modifier untuk value 
    // jadi private selepas extends

public class Test {

    public static void main(String[] args) {

        KelasBaru kelasbaru = new KelasBaru();
        kelasbaru.setValue(50);
        System.out.println("Value = " + kelasbaru.getValue());
    }
}
