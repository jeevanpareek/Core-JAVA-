import java.util.*;

public class N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("The value of a after swapping is : " +a);
        System.out.println("The value of b after swapping is : " +b);
    }
    
}
