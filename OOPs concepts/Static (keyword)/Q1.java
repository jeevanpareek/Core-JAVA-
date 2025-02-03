class A{
    static class B{
        void show(){
            System.out.println("Hello");
        }
    }
}
public class Q1{
    public static void main(String[] args) {
        A.B p = new A.B();
        p.show();
    }
}