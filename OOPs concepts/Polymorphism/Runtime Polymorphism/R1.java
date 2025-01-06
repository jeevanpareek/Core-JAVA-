class A{
    void show(){
        System.out.println("Jeevan");
    }
}
class B extends A{
    void show(){
        System.out.println("Hello !!");
    }
}
public class R1{
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}