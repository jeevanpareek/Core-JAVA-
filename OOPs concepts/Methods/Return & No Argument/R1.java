class A{
    int show(){
        int a = 5;
        return a;
    }
}
class B{
    int show(){
        int a = 55;
        return a;
    }
    int b(){
        int a = 555;
        return a;
    }
}
class C{
    int show(){
        int a = 5555;
        return a;
    }
    int b(){
        int a = 55555;
        return a;
    }
    int c(){
        int a = 555555;
        return a;
    }
}
class D{
    int show(){
        int a = 5555555;
        return a;
    }
    int b(){
        int a = 55555555;
        return a;
    }
    int c(){
        int a = 555555555;
        return a;
    }
    int d(){
        int a = 55555444;
        return a;
    }
}
public class R1 {
    public static void main(String[] args) {

        A p = new A();
        System.out.println(p.show());

        B q = new B();
        System.out.println(q.show());
        System.out.println(q.b());

        C r = new C();
        System.out.println(r.show());
        System.out.println(r.b());
        System.out.println(r.c());

        D s = new D();
        System.out.println(s.show());
        System.out.println(s.b());
        System.out.println(s.c());
        System.out.println(s.d());
    }
    
}
