package AccessModifier.StudyPrivate.Class1;

public class ClassPrivate {
    
    private int value = 100;
    int sum; // default jadi private package

    public ClassPrivate() {}

    public ClassPrivate (int sum) {
        this.sum = sum;
        value += sum;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
