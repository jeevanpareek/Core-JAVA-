class A{
    void show(){
        System.out.println("BMW");
    }
}
class B extends A{
    void show1(){
        System.out.println("Audi");
    }
}
class C extends A{
    void show2(){
        System.out.println("Mercedes");
    }
}
public class H6 {
    public static void main(String[] args) {
        A p = new B();
        p.show();

        A q = new C();
        q.show();
    }
}
