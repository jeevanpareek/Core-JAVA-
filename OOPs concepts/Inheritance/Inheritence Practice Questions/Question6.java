// Create a Java program where a Dog class inherits a Mammal class, 
// and call a method to display their characteristics.

class Mamal{
    void characteristics(){
        System.out.println("Mamals can give birth to thier babies");
    }
}
class Dog extends Mamal{
    void dog(){
        System.out.println("Dog barks");
    }
}
public class Question6{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.characteristics();
        d.dog();
    }
}
