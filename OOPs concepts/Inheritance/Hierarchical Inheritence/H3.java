class A{
    private int a;
     void set1(int a){
        this.a = a;
     }
     int get1(){
        return a;
     }
}
class B{
    private float b;
    void set2(float b){
        this.b = b;
    }
    float get2(){
        return b;
    }
}
class C{
    private char c;
    void set3(char c){
        this.c = c;
    }
    char get3(){
        return c;
    }
}
class D{
    private double d;
    void set4(double d){
        this.d = d;
    }
    double get4(){
        return d;
    }
}
public class H3 {
    public static void main(String[] args) {
        A p = new A();
        p.set1(45);

        
        System.out.println(p.get1());
    }
}
