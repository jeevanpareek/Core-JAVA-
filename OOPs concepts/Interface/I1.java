
interface A{
    void show();
    void show1(int a);
     int show2();
     int show3(int b);
}
class B implements A{
    
    public void show(){
        System.out.println("Hello");
    }
    public void show1(int a){
        System.out.println(a);
    }
    public int show2(){
        System.out.println("Hii");
        
        return 0;
    }
    public int show3(int b){
        System.out.println(b);

        return b;
    }

}
public class I1{
    public static void main(String[] args) {
        B p = new B();
        p.show();
        p.show1(20);
         p.show2();
         p.show3(45);
    }
}