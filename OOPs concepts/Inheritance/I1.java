class A extends B{
    void show(){
        int a = 25;
        System.out.println(a);
    }
    void show2(int a){
        System.out.println(a);
    }
}
class B{
    int show3(){
        int a = 252;
        return a;
    }
    int show4(int a){
        return a;
    }
}
public class I1{
    public static void main(String[] args) {
        A p = new A();
        p.show();
        p.show2(300);
        System.out.println(p.show3());
        System.out.println(p.show4(210));
    }
}
