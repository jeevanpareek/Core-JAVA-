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
class C extends B{
    void show(){
        System.out.println("Hii !!");
    }
}
public class R9{
    public static void main(String[] args) {
        C p = new C();
        p.show();
    }
}