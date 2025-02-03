class A{
    int b = 20;
    static{
        A p = new A();
        System.out.println(p.b);
    }
}
public class Q6 {
    public static void main(String[] args) {
       new A();
    }
}
