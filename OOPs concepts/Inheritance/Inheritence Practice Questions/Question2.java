// Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics.
class Dog extends Mammal{
    void show(){
        System.out.println("Dog is an animal");
    }
}
class Mammal{
    void show1(){
        System.out.println("Mammals are vertebrates with hair, mammary glands & a diaphragm");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
        d.show1();
    }
}
