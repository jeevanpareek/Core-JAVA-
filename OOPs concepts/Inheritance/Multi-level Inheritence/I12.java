class A{
    A(){
        System.out.println("Hello");
    }
}
class B extends A{
    B(){
        System.out.println("Hello World !!");
    }
}
class C extends B{
    C(){
        System.out.println("Hello World Hello");
    }
}
public class I12 {
    public static void main(String[] args) {
        new C();
        
    }
}
