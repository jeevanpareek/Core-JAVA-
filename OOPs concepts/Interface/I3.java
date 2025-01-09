// interface : 
// 	method1 :no return and no argument 
// 	method2:default no return and  argument 
// 	method3:private return and no argument 
// 	method4 :private return and argument 

// another class access
interface A{
    void show();
    default void show1(int a){
        System.out.println(a);
        show2();
        show3(20);
    }
    private int show2(){
        System.out.println("Hii");

        return 0;
    }
    private int show3(int c){
        System.out.println(c);

        return c;
    }
}
class D implements A{
    public void show(){
        System.out.println("Jeevan Pareek");
    }
}
public class I3{
    public static void main(String[] args) {
        D p = new D();
        p.show();
        p.show1(23659);
    }
}
