interface A{
    private int show(){
        System.out.println("Hello");

        return 0;
    }
    default void show2(){
        show();
    }
}
interface B{
    int show(int a);
}
class D implements A,B{
    public int show(int a){
        System.out.println(a);

        return a;
    }
}
public class I4 {
    public static void main(String[] args) {
        D p = new D();
        p.show(20);
        p.show2();
    }
}
