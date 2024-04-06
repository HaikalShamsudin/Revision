package ClassAndConstructors;


class MyClass {  //udemy q75
    private int var1 = 100;
    public int getVar1() {
        return var1;
    }
    public void setVar1(int var1) {
        this.var1 = var1;
    }
    public int var2 = 200;
    public void doCalc() {
        var1 = 100*2; 
        var2 = 200*2;
        
    }

}

public class Tester {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.doCalc();
        // System.out.println(my.var1 + " " + my.var2); // var1 tak dpt access sebab private pada instance variable.
        my.setVar1(10);  // nak ubah var1, pakai setter method
        System.out.println(my.getVar1() + " " + my.var2); // nak access kena pakai getter method
    }
}
