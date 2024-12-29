// Implement a program where a Car class inherits from a Vehicle class, and call the inherited method in the subclass.
class Vehicle{
    void show(){
        System.out.println("Vehicles are used to make our daily commutation easy .");
    }
}
class Car extends Vehicle{
    void car(){
        System.out.println("Car is a type of vehicle ");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.car();
    }
}
