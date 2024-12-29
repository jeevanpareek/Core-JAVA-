// Write a Java program to demonstrate multilevel inheritance where Car inherits Vehicle and ElectricCar inherits Car.
class Vehicle{
    void show(){
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle{
    void show1(){
        System.out.println("Car");
    }
}
class ElectricCar extends Car{
    void show2(){
        System.out.println("Electric Car");
    }
}
public class Question4 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.show();
        e.show1();
        e.show2();
    }
}
