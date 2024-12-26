class A{
    A m1(int a){
        System.out.println(a);
        return this;
    }
}
class B extends A{
    int m2(){
        int a = 45;
        return a;
    }
}
class C extends B{
    void m3(){
        System.out.println("Hello World");
    }
}
class D extends C{
    void m4(int b){
        System.out.println(b);
    }
}
public class I9 {
    public static void main(String[] args) {
        D p = new D();
        p.m1(20);
       System.out.println(p.m2());
        p.m3();
        p.m4(420);
    }
}
