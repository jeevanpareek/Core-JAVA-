import java.util.Scanner;

class Add{
    Add(int a, int b){
        int c = a+b;
        System.out.println("The sum of a&b is : "+c+"\n");
    }
}
class Sub{
    Sub(int a, int b){
        int c = a-b;
        System.out.println("The sub of a&b is : "+c+ "\n");
    }
}
class Multi{
    Multi(int a, int b){
        int c = a*b;
        System.out.println("The value of a&b is : "+c+"\n");
    }
}
class Divide{
    Divide(int a, int b){
        int c = a/b;
        System.out.println("The value of a&b is : "+c);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        new Add(a,b);


        System.out.print("Enter the value of a : ");
        int c = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int d = sc.nextInt();

        new Sub(c,d);


        System.out.print("Enter the value of a : ");
        int e = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int f = sc.nextInt();

        new Multi(e,f);


        System.out.print("Enter the value of a : ");
        int g = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int h = sc.nextInt();

        new Divide(g,h);
    }
}
