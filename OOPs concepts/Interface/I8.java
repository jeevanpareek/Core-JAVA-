interface A{
    int show(int a);
    private void show1(){
        System.out.println("Hello");
    }

    interface B{
        int show2(int b);
        private void show2(){
            System.out.println("Hey!!");
        }
    }
}
class C implements A.B{
    public int show2(int b){
        System.out.println(b);

        return b;
    }
}
public class I8 {
    public static void main(String[] args) {
        C p = new C();
        p.show2(852);
    }
}
