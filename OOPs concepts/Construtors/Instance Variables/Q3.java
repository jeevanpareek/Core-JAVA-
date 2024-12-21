import java.util.*;
class A{
    Scanner sc = new Scanner(System.in);
    int a ,b;
    A (int c, int d){

        a=c;
        b = d;

        int e = a+b;

        System.out.println("The value of a&b is "+e);
    }
}
class B{
    int s ,d;
    B (int c, int f){
        s = c;
        d = f;

        int e = s+d;

        System.out.println("The value of a&b is "+e);
    }
}
class C{
    int g ,l;
    C (int c, int d){
        g = c;
        l = d;

        int e = g+l;

        System.out.println("The value of a&b is "+e);
    }
}
class D{
    int a ,b;
    D (int c, int d){
        a = c;
        b = d;

        int e = a+b;

        System.out.println("The value of a&b is "+e);
    }
}
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        
        new A(a, b);


        System.out.println("Enter the value of a :");
        int c = sc.nextInt();
        
        System.out.println("Enter the value of b :");
        int d = sc.nextInt();
        
        new B(c, d);


        System.out.println("Enter the value of a :");
        int e = sc.nextInt();
        
        System.out.println("Enter the value of b :");
        int f = sc.nextInt();
        
        new C(e,f);


        System.out.println("Enter the value of a :");
        int h = sc.nextInt();
        
        System.out.println("Enter the value of b :");
        int i = sc.nextInt();
        
        new D(h,i);
    }
}
