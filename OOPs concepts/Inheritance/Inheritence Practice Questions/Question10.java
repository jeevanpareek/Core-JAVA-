// Write a Java program to demonstrate multilevel inheritance
//  where Car inherits Vehicle and ElectricCar inherits Car.

class Vehicle{
    void show(){
        System.out.println("Hello");
    }
}
class Car extends Vehicle{
    void show1(){
        System.out.println("Car is Vehicle");
    }
}
class ElectricCar extends Car{
    void show2(){
        System.out.println("Electric car is a type of car");
    }
}
public class Question10 {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.show1();

        ElectricCar e = new ElectricCar();
        e.show();
        e.show1();
        e.show2();
    }
}
