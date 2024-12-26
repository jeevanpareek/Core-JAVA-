class A{
    void show(){
        System.out.println("Hello!!");
    }
}
class B{
    void show1(){
        System.out.println("Hi!!");
    }
}
class C extends A{
   
    void show2(){
        System.out.println("Nameste!!");
        A p = new A();
        p.show();
    }
    int show4(int a){
        return a;
    }
}
class D{
    
    void show3(){
        System.out.println("Sasriyakal!!");
        B q = new B();
        q.show1();
    }
}
public class I6 {
    public static void main(String[] args) {
        C p = new C();
        p.show2();
        System.out.println(p.show4(45));

        D q = new D();
        q.show3();
    }
}
