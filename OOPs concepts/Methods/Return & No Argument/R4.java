class A{
    A show(){
        System.out.println("Welcome to India");
        return this;
    }
}
public class R4 {
    public static void main(String[] args) {
        A p = new A();
        System.out.println(p.show());
    }
}
