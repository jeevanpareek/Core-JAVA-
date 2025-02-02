// Implement a program where a Car class inherits from a Vehicle class,
//  and call the inherited method in the subclass.

class Vehicle{
    void engine(){
        System.out.println("Vehicles have engines");
    }
}
class Car extends Vehicle{
    void pertol(){
        System.out.println("Engine needs pertol to start");
    }
}
public class Question7 {
    public static void main(String[] args) {
        Car c = new Car();
        c.engine();
        c.pertol();
    }    
}
