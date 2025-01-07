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
class C extends A{
    void show(int a){
        System.out.println(a);
    }
}
public class R7{
    public static void main(String[] args) {
        B p = new B();
        p.show(20);

        C q = new C();
        q.show(20);
    }
}