class A{
    void sum(){
        System.out.println("Hello");
    }
}
class B extends A{
    void sub(){
        System.out.println("Hi");
    }
}
public class I2 {
    public static void main(String[] args) {
        
        B p = new B();
        p.sum();
        p.sub();
    }
    
}
