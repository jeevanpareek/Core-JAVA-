// Write a Java program where a Rectangle class inherits a Shape class and 
// calculates the area using a method in the superclass.

import java.util.Scanner;

class Shape{
    void Area(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle : ");
        int a = sc.nextInt();

        System.out.print("Enter breadth of rectangle : ");
        int b = sc.nextInt();

        int c = a*b;
        
        System.out.println("The area of rectangle is "+c);
    }
}
class Rectangle extends Shape{

}
public class Question8 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.Area();
    }
}
