class A{
    //Abstract class
    abstract class B{
        void show(){
            System.out.println("Hii");
        }
    }
    //Static class
    static class C{
        void show1(){
            System.out.println("Hello");
        }
    }
    //Interface
    interface D{
        int show2();
    }
    //Inner Class
    class E{
        int show3(int z){
            System.out.println(z);

            return z;
        }
    }
}
class F implements A.D{
    public int show2(){
        System.out.println("520");

        return 0;
    }
}
class G extends A{
    class H extends B{

    } 
}
public class Q4 {
    public static void main(String[] args) {
        G e = new G();
        A.B r = e. new H();
        r.show();

        A.C p = new A.C();
        p.show1();

        F f = new F();
        f.show2();

        A q = new A();
        A.E w = q.new E();
        w.show3(253);
    }
}
