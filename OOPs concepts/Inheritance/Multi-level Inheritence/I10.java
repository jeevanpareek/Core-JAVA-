class A{
    void m1(){
        System.out.println("Hello World !!");
    }
}
class B extends A{
    void m2(){
        System.out.println("Hello World Hello !!");
    }
}
class C extends B{
    void m3(){
        System.out.println("Hello World Hello World !!");
    }
}
class D extends C{
    void m4(){
        System.out.println("Hello World Hello World Hello !!");
    }
}
public class I10 {
    public static void main(String[] args) {
        D p = new D();
        p.m1();
        p.m2();
        p.m3();
        p.m4();
    }    
}
