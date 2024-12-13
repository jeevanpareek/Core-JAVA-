import java.util.*;

public class M {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The value of a after swapping is : " +a);
        System.out.println("The value of b after swapping is : " +b);
    }
    
}
