interface A{
    private String show(String name){
        System.out.println(name);

        return name;
    }
    default void show1(){
        show("Jeevan");
    }
}
interface B extends A{
    default void show2(float b){
        System.out.println(b);
    }
}
interface C extends B{
    char show3();

    interface E{
        void show6();
    }
}
interface D extends C{
    void show4();

    class F{
        void show5(){
            System.out.println("Hii I am Jeevan Pareek");
        }
    }
}
class G extends D.F implements B{
    public char show3(){
        System.out.println('J');

        return 0;
    }
    public void show6(){
        System.out.println("Kajal Mam");
    }
    public void show4(){
        System.out.println("1.258");
    }
}
public class I16 {
    public static void main(String[] args) {
        G p = new G();
        p.show1();
        p.show2(2.3f);
        p.show3();
        p.show4();
        p.show5();
        p.show6();
    }
}
