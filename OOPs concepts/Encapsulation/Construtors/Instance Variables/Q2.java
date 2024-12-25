class A{
    int a, b;

    A (int q, int r){
        a = q;
        b = r;

        int e = a+b;

        System.out.println("The value of a&b is "+e);
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
public class Q2 {
    public static void main(String[] args) {
        
       A p = new A(45, 25);
       p.show();
        

    }
}
