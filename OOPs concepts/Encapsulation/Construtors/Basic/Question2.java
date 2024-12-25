// Write a program to create a class Person with a default constructor that initializes name to "Unknown" and age to 0.

class A{
    A(){
        String name = "Unknown";
        int age = 0; 

        System.out.println(name+ " " +age);
    }
}
public class Question2 {
    public static void main(String[] args) {
        new A();
    }
}
