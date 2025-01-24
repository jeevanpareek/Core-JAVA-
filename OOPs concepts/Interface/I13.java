interface A{
    void show();

    class B{
        void  show1(){
            System.out.println("Hello !!");
        }
    }
}
class C extends A.B{
    public void show(){
        System.out.println("Hey!! I am Jeevan Pareek");
    }
}
public class I13 {
    public static void main(String[] args) {
        C p = new C();
        p.show();
        p.show1();
    }
}
