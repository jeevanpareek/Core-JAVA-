interface A{
    private int show(int a){
        System.out.println(a);

        return a;
    }
    default char show1(char b){
        show(20);
        System.out.println(b);

        return b;
    }
    static float show2(float c){
        System.out.println(c);

        return c;
    }
}
class B implements A{

}
public class Q5 {
    public static void main(String[] args) {
        B p = new B();
        p.show1('J');

        A.show2(20.25f);
    }
}
