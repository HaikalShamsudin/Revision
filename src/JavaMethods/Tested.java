package JavaMethods;


class Messenger {
    String msg; //constant variable

    //constructor
    Messenger (String msg) {
        this.msg = msg;
    }

    //method
    public void writeMsg (){
        System.out.println(msg);
    }

    //method
    public void readMsg() { //method readmsg dia panggil writemsg (method atas)
        writeMsg(); // todo list
    }
}

public class Tested {
    public static void main(String[] args) {
        Messenger m = new Messenger("All the best");
        m.readMsg();
    }
}
