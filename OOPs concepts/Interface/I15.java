interface A{
    int show(int a);
}
interface B extends A{
    void show1(int b);
}
interface C extends B{
    char show2();
}
interface D extends C{
    void show3();
}
class Access implements D{
    public int show(int a){
        System.out.println(a);

        return a;
    }
    public void show1(int b){
        System.out.println(b);
    }
    public char show2(){
        System.out.println('J');

        return 0;
    }
    public void show3(){
        System.out.println("1.258");
    }
}
public class I15 {
    public static void main(String[] args) {
        Access a = new Access();
        a.show(20);
        a.show1(789);
        a.show2();
        a.show3();
    }
}
