class A{
    A(){
        int a = 100;
        System.out.println(a);
    }
    void J(){
        int a = 50;
        System.out.println(a);
    }
    char K(char a){
        return a;
    }
    float H(){
        float a = 2.2f;
        System.out.println(a);
        return a;
    }
}
public class Q3 {
    public static void main(String[] args) {
        
        A p = new A();
        p.J();
        p.H();
       System.out.println(p.K('a'));


       A q = new A();

       A r = new A();
       r.J();

       A t = new A();
       System.out.println(t.K('J'));

       A s = new A();
       s.H();
    }
}
