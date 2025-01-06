class A{
    void show(){
        System.out.println("Jeevan");
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("Hello !!");
    }
}
class C extends A{
    void show(){
        super.show();
        System.out.println("Hii !!");
    }
}
public class R6 {
    public static void main(String[] args) {
        B p = new B();
        p.show();

        C w = new C();
        w.show();
    }
}
