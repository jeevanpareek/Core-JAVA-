interface A{
    class B{
        B show(){
            System.out.println("Hello World");

            return this;
        }
    }
}
class C extends A.B{

}
public class I9 {
    public static void main(String[] args) {
        C p = new C();
        p.show();
    }
}
