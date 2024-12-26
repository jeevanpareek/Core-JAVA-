class A{
    void m1(){
        System.out.println("Hello world");
    }
    void m2(){
        this.m1();
    }
    void m3(){
        this.m2();

    }
    void m4(){
        this.m3();

    }
    void m5(){
        this.m4();

    }
}
public class I7 {
    public static void main(String[] args) {
        A p = new A();
        p.m5();
    }
}
