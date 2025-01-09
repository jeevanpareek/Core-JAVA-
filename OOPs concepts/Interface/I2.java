
interface A{
    void show();
} 
interface B{
    int show1(int a);
} 
interface C{
    int show2();
} 
interface D{
    void show3(int a);
} 

class E implements A{
    public void show(){
        System.out.println("Hello");
    }
}
class F implements B{
    public int show1(int a){
        System.out.println(a);

        return a;
    }
}
class G implements C{
    public int show2(){
        System.out.println("Hello");

        return 0;
    }
}
class H implements D{
    public void show3(int b){
        System.out.println(b);
    }
}
public class I2 {
    public static void main(String[] args) {
        E p = new E();
        p.show();

        F q = new F();
        q.show1(20);

        G w = new G();
        w.show2();

        H e = new H();
        e.show3(45);
    }
}
