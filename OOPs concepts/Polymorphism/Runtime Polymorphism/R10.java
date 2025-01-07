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
class C extends B{
    void show(){
        super.show();
        System.out.println("Hii !!");
    }
}
public class R10{
    public static void main(String[] args) {
        C p = new C();
        p.show();
    }
}
