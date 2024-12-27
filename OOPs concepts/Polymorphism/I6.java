class A{
    void show(){
        System.out.println("BMW");
    }
}
class B extends A{
    void show1(){
        System.out.println("Ferreri");
    }
}
class C extends B{
    void show2(){
        System.out.println("Mercedes");
    }
}
class D extends C{
    void show3(){
        System.out.println("Audi");
    }
}
public class I6 {
    public static void main(String[] args) {
        C p = new D();
        p.show();
        p.show1();
        p.show2();
    }
}
