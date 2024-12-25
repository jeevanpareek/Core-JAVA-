import java.util.Scanner;

class Sum{
    int a , b;
    
    Sum(int a, int b){
        this.a = a;
        this.b = b;

        int e = a+b;

        System.out.println(" The sum of a&b is : "+e);
    }
}
class Sub{
    int a , b;
    
    Sub(int a, int b){
        this.a = a;
        this.b = b;

        int e = a-b;

        System.out.println(" The sub of a&b is : "+e);
    }
}
class Multi{
    int a , b;
    
    Multi(int a, int b){
        this.a = a;
        this.b = b;

        int e = a*b;

        System.out.println(" The product of a&b is : "+e);
    }
}
class Divide{
    int a , b;
    
    Divide(int a, int b){
        this.a = a;
        this.b = b;

        int e = a/b;

        System.out.println(" The division of a&b is : "+e);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int c = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int d = sc.nextInt();

        new Sum(c, d);


        System.out.println("Enter the value of a: ");
        int g = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int h = sc.nextInt();

        new Sub(g, h);


        System.out.println("Enter the value of a: ");
        int y = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int z = sc.nextInt();

        new Multi(y, z);


        System.out.println("Enter the value of a: ");
        int w = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int q = sc.nextInt();

        new Divide(w, q);
    }
}
