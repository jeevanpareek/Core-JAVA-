// Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.

class Student{
    void show(){
        System.out.println("Hello ! My name is Jeevan pareek");
    }
}
class Person extends Student{
    void show1(){
        System.out.println("Hello");
    }
}

public class Question1{
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        p.show1();
    }
}