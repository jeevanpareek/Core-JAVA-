class A{
    void show(){
        System.out.println("Hello World");
    }
}
class B extends A{
    int show1(){
        int a = 45;
        System.out.println(a);

        return a;
    }
}
class C extends A{
    int show2(int a){
        // a = 20;
         System.out.println(a);

        return a;
    }
}
class D extends A{
    void show3(int a){
        // a = 20;
         System.out.println(a);
    }
}
class E extends A{
    int b;
    E show4(int b){
        this.b = b;
        System.out.println(b);
        return this;
    }
}

public class H1{
    public static void main(String[] args) {
        
        B p = new B();
        p.show();
        p.show1();

        C q = new C();
        q.show();
        q.show2(45);

        D w = new D();
        w.show();
        w.show3(25);

        E e = new E();
        e.show();
        e.show4(63);
    }
}