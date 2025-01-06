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
class C extends A{
    void show(){
        System.out.println("Hii !!");
    }
}
public class R5{
    public static void main(String[] args) {
        B p = new B();
        p.show();

        C q = new C();
        q.show();
    }
}