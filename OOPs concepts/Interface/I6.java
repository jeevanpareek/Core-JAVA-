interface A{
    int show();
    interface B{
        int show1(int a);
    }
}
class C implements A.B{
    public int show1(int a){
        System.out.println(a);

        return a;
    } 
}
public class I6 {
    public static void main(String[] args) {
        C p = new C();
        p.show1(20);
    }
}
