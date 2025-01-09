
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

class E{
    public void show(){
        System.out.println("Hello");
    }
}
class F{
    public int show(int a){
        System.out.println(a);

        return a;
    }
}
class G{
    public int show(){
        System.out.println("Hello");

        return 0;
    }
}
class H{
    public void show(int b){
        System.out.println(b);
    }
}
public class I2 {
    public static void main(String[] args) {
        E p = new E();
        p.show();

        F q = new F();
        q.show(20);

        G w = new G();
        w.show();

        H e = new H();
        e.show(45);
    }
}
