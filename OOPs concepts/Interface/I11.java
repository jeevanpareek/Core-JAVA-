class A{
    interface B{
        int show(int a);
    }
}
class C implements A.B{
    public int show(int a){
        System.out.println(a);

        return a;
    }
}
public class I11 {
    public static void main(String[] args) {
        C p = new C();
        p.show(2000);
    }

}
