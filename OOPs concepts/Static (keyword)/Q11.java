class A{
    int a = 100;
    static void show(){
        A p = new A();
        System.out.println(p.a);
        System.out.println("Hello");
    }
}
public class Q11 {
    public static void main(String[] args) {
        A.show();
    }
}
