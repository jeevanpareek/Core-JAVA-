import java.util.Scanner;

class A{
    A (int a, int b){
        int c = a+b;
        System.out.print("The sum of a&b is : "+c);
    }
}
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a :");
        int a = sc.nextInt();


        System.out.print("Enter the value of b :");
        int b = sc.nextInt();

        new A(a, b);
    }
}