class Primitive{
    int a(int a){
        return a;
    }
    char b(char s){
        return s;
    }
    float c(float d){
        return d;
    }
    double d(double f){
        return f;
    }
    long e(long g){
        return g;
    }
    
    boolean g(boolean j){
        return j;
    }
   
}
public class R1{
    public static void main(String[] args) {
        Primitive p = new Primitive();
        System.out.println(p.a(55));
        System.out.println(p.b('a'));
        System.out.println(p.c(5.5f));
        System.out.println(p.d(5.5656565));
        System.out.println(p.e(55));
        System.out.println(p.g(true));
    }
}