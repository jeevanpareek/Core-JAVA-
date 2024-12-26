class A{
    private int a = 100;

    void set(int a){
        this.a = a;
    }
    int get(){
        return a;
    }
}
class B extends A{
    void show(){
        System.out.println(get());
    }
}
public class I9 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
