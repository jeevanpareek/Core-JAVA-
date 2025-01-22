interface A{
    interface B{
        int show(int a);

        private int show1(){
            System.out.println("Hello World");

            return 0;
        }
    }
}
class C implements A.B{
    public int show(int a){
        System.out.println(a);

        return a;
    }
} 
public class I7 {
    public static void main(String[] args) {
        C p = new C();
        p.show(45);
    }
}
