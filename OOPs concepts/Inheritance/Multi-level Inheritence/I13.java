import java.util.Scanner;

class A{
    A(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println(c);

    }
}
class B extends A{
    B(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        int c = a*b;

        System.out.println(c);
    }
}
class C extends B{
    C(){
        System.out.println("Hello World Hello");
    }
}
public class I13 {
    public static void main(String[] args) {
        new C();
        
    }
}