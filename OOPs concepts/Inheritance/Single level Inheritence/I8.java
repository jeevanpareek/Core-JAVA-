class A{
    void m1(){
        System.out.println("Hello World");
    }
    void m2(){
        this.m1();
    }
}
class B extends A{
    void m3(){
        System.out.println("My name is Jeevan Pareek");
    }
    void m4(){
        this.m3();
    }
    void m5(){
        A p = new A();
        p.m2();
    }
}
public class I8 {
    public static void main(String[] args) {
        B p = new B();
        p.m4();
        p.m5();
    }
}
