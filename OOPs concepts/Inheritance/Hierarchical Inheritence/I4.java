class A{
    int a = 45;
    int b = 450;
    int c = 4500;
    int d = 45000;

}
class B extends A{
    void show(){
       System.out.println(+a);
       System.out.println(+b);
    }
}
class C extends A{
    void show(){
       System.out.println(+c);
       System.out.println(+d);
    }
}
class D extends A{
    void show(){
       System.out.println(+a);
    }
}
public class I4 {
    public static void main(String[] args) {
        B p = new B();
        p.show();


        C q = new C();
        q.show();


        D e = new D();
        e.show();
    }   
}
