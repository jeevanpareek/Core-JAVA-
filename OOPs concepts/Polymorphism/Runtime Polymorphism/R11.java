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
class C extends B{
    void show(int a){
        System.out.println(a);
        System.out.println("Hii !!");
    }
}
public class R11{
    public static void main(String[] args) {
        C p = new C();
        p.show(20);
    }
}