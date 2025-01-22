interface A{
    interface B{
        void show();
    }
}
class C implements A.B{
    public void show(){
        System.out.println("Hello");
    }
}
public class I5 {
    public static void main(String[] args) {
        C p = new C();
        p.show();
    }
}
