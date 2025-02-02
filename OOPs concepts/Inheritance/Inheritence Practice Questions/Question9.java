// Write a Java program where a subclass inherits from a superclass
//  and attempts to access private members (and observe the result).


class Superclass{
    private void show(){
        System.out.println("The content in this method is private");
    }
    // We can access the private methods by creating a public method in the same 
    // class and then calls it in subclass.
    
    void show1(){
        show();
    }
}
class Subclass extends Superclass{

}
public class Question9 {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.show1();
    }
}
