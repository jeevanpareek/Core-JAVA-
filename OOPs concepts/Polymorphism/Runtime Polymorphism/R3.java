class A{
    void show(int a){
        System.out.println("Jeevan");
    }
}
class B extends A{
    void show(int a){
        System.out.println(a);
        System.out.println("Hello !!");
    }
}
public class R3{
    public static void main(String[] args) {
        B p = new B();
        p.show(20);
    }
}