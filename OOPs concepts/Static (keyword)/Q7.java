class A{
    static int a = 45;
    static {
        System.out.println(a);
    }
}
public class Q7 {
    public static void main(String[] args) {
        new A();
    }
}
