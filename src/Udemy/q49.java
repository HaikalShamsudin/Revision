package Udemy;

class Course {
    String courseName;
}

public class q49 {
    String stuName;
    public static void main(String[] args) {
        q49 s = new q49();
        s.stuName = args[0];
        Course c = new Course();
        c.courseName = args[1];
        System.out.println(s.stuName = " is studying " + c.courseName);
    }
}



// javac q49.java 
// java q49 "Richard William" Java

// how to get output -->> Richard William is studying Java