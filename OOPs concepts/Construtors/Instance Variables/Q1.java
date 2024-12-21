import java.util.Scanner;

class A{
    int a,b;
    void add(int c, int d){
        a = c;
        b = d;
        int e = a+b;
        System.out.println("The sum of a&b is "+e);
    }
    void sub(int c, int d){
        a = c;
        b = d;
        int e = a-b;
        System.out.println("The sub of a&b is "+e);
    }
    void div(int c, int d){
        a = c;
        b = d;
        int e = a/b;
        System.out.println("The division of a&b is "+e);
    }
    void multi(int c, int d){
        a = c;
        b = d;
        int e = a*b;
        System.out.println("The multi of a&b is "+e);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A p = new A();
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        p.add(a, b);

        System.out.println("Enter the value of a :");
        int z = sc.nextInt();

        System.out.println("Enter the value of b :");
        int x = sc.nextInt();
        p.sub(z, x);;

        System.out.println("Enter the value of a :");
        int v = sc.nextInt();

        System.out.println("Enter the value of b :");
        int q = sc.nextInt();
        p.div(v, q);

        System.out.println("Enter the value of a :");
        int n = sc.nextInt();

        System.out.println("Enter the value of b :");
        int m = sc.nextInt();
        p.multi(n, m);
    }
}
