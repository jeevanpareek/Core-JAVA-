interface A{
    void show();
}
interface B{
    void show();
}
interface C{
    void show();
}
interface D{
    void show();
}
class E implements A,B,C,D{
    public void show(){
        System.out.println("Hey !! I am Jeevan Pareek");
    }
}
public class I17 {
    public static void main(String[] args) {
        E e = new E();
       ((A)e).show();
       ((B)e).show();
       ((C)e).show();
       ((D)e).show();
    }
}
