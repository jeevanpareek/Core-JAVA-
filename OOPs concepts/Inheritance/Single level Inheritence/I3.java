import java.util.Scanner;

class A extends B{
    int a,b;
    void add(int a, int b){
        this.a = a;
        this.b = b;

        int c = a+b;
        System.out.println("The sum of a&b is : "+c);
    }
}
class B{
    int c,d;
    void sub(int c, int d){
        this.c = c;
        this.d = d;

        int v = c-d;

        System.out.println("The sub of a&b is : "+v);
    }
}
public class I3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A p = new A();
        System.out.print("Enter the value of a : ");
        int d = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int e = sc.nextInt();

        p.add(d, e);


        System.out.print("Enter the value of a : ");
        int g = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int h = sc.nextInt();

        p.sub(g,h);
    }
}
