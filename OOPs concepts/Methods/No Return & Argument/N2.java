import java.util.*;

class A{
    void add(int a,int b){
       
         int c = a+b;

        System.out.println("The addition of a&b is : "+c);
         
    }
    void sub(int c,int d){
       
        
         int e = c-d;
        
        System.out.println("The sub of a&b is : "+e);
        
       
    }
    void multiply(int g, int h){
        
        
        int c = g*h;
        
        System.out.println("The product of a&b is : "+c);
        
        
    }
    void divide(int i, int j){
       
        
        int c = i/j;
        
        System.out.println("The division of a&b is : "+c);

        
    }
}
public class N2{
    public static void main(String[] args) {
        A p = new A();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=sc.nextInt();
        
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        p.add(a, b);

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int c = ab.nextInt();
        
        System.out.println("Enter the value of b : ");
        int d = ab.nextInt();
        p.sub(c,d);

        Scanner cd = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int g = cd.nextInt();
        
        System.out.println("Enter the value of b : ");
        int h = cd.nextInt();
         p.multiply(g,h);

         Scanner ef = new Scanner(System.in);
         System.out.println("Enter the value of a :");
        int  i = ef.nextInt();
         
         System.out.println("Enter the value of b : ");
        int  j = ef.nextInt();
          p.divide(i,j);
    }
}