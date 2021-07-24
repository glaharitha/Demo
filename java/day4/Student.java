package day4;
// student is sub-class/child class
public class Student extends School {

    public static void main(String[] args) {
        Student s = new Student();
        s.rollnumber();
        s.grade();
        s.subject();
        s.section();
    }

    public void section(){
        System.out.println("Student section : A");
    }
}
