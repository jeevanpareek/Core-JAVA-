import java.util.Scanner;

class A{
    int a, b;
    void show(int a, int b){
        this.a = a;
        this.b = b;

        int e = a+b;

        System.out.println("The sum of a&b is : "+e);
    }
}
class B{
    int c,d;
    void show(int c, int d){
        this.c = c;
        this.d = d;

        int e = c-d;

        System.out.println("The sub of a&b is : "+e);
    }
}
class C{
    int e,f;
    void multi(int e, int f){
        this.e = e;
        this.f = f;

        int g = e*f;

        System.out.println("The multi of a&b is :"+g);
    }
}
class D{
    int g,h;
    void divide(int g, int h){
        this.g = g;
        this.h = h;

        int i = g/h;

        System.out.println("The division of a&b is :"+i);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int x = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int y = sc.nextInt();

        A p =new A();
        p.show(x, y);


        System.out.println("Enter the value of a : ");
        int b = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int c = sc.nextInt();

        B q = new B();
        q.show(b, c);


        System.out.println("Enter the value of a : ");
        int e = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int f = sc.nextInt();

        C m = new C();
        m.multi(e, f);


        System.out.println("Enter the value of a : ");
        int t = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int u = sc.nextInt();

        D l = new D();
        l.divide(t, u);

    }

}
