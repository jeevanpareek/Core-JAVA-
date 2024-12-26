class A{
    private int a;
    void set(int a){
        this.a = a;
    }
    int  get(){
        return a;
    }
}
class B extends A{
    private int b;
    void set1(int b){
        this.b = b;
    }
    int get1(){
        return b;
    }
}
public class I5 {
    public static void main(String[] args) {
        B p = new B();
        p.set(45);
        p.set1(25);

        System.out.println(p.get());
        System.out.println(p.get1());
    }
}
