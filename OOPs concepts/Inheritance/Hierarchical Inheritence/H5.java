class A{
    void m1(){
        System.out.println("Jeevan Pareeek");
    }
    void m2(){
        m1();
        System.out.println("I'm Jeevan Pareek");
    }
    void m3(){
        m2();
        System.out.println("45");
    }
}
class B extends A{
    void m4(){
        System.out.println("BMW");
    }
    void m5(){
        m4();
        System.out.println("Audi");
    }
    void m6(){
        m5();
        System.out.println("Mercedes");
    }
}
class C extends A{
    void m7(){
        System.out.println("Porsche");
    }
    void m8(){
        m7();
        System.out.println("Ferreri");
    }
}
class D extends A{
    D(){
        System.out.println("Above companies produces supercars!!");
    }
}
public class H5 {
    public static void main(String[] args) {

        B q = new B();
        q.m3();
        q.m6();

        C w = new C();
        w.m3();
        w.m8();
        
        D e = new D();
        e.m3();
    }
}
