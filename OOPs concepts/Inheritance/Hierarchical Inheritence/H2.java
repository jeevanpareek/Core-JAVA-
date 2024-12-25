class A{
    A(){
        System.out.println("hello World");
    }
}
class B extends A{
    B(){
        System.out.println("Hi!!");
    }
}
class C extends A{
    C(){
        System.out.println("Nameste!!");
    }
}
class D extends A{
    D(){
        System.out.println("I'm Jeevan Pareek ");
    }
}
public class H2 {
    public static void main(String[] args) {
        new B();
        new C();
        new D();
    }
}
