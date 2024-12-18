import java.util.*;

class A{
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println("The addition of a&b is : "+c);
         
    }
    void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int c = sc.nextInt();
        
        System.out.println("Enter the value of b : ");
        int d = sc.nextInt();
        
        int e = c-d;
        
        System.out.println("The sub of a&b is : "+e);
        
       
    }
    void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        
        int c = a*b;
        
        System.out.println("The product of a&b is : "+c);
        
        
    }
    void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        
        int c = a/b;
        
        System.out.println("The division of a&b is : "+c);

        
    }
}
public class O4{
    public static void main(String[] args) {
        A p = new A();
        p.add();
        p.sub();
       // p.multiply();
       // p.divide();
    }
}