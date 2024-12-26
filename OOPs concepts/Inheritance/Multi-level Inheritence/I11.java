class A{
    private int a; 
    void set1(int a){
        this.a = a;
    }
    int get1(){
        return a;
    }
}
class B extends A{
    private char c;
    void set2(char c){
        this.c = c;
    }
    char get2(){
        return c;
    }
}
class C extends B{
    private float f;
    void set3(float f){
        this.f =f;
    }
    float get3(){
        return f;
    }
}
class D extends C{
    private double d;
    void set4(double d){
        this.d = d;
    }
    double get4(){
        return d;
    }
}
public class I11 {
    public static void main(String[] args) {
        D p = new D();
       p.set1(45);
       p.set2('J');
       p.set3(2.2f);
       p.set4(2.12);


       System.out.println(p.get1()); 
       System.out.println(p.get2()); 
       System.out.println(p.get3()); 
       System.out.println(p.get4()); 
    }    
}
