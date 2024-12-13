import java.util.*;

public class H {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter first number : ");
        int b = sc.nextInt();

        System.out.println("Enter first number : ");
        int c = sc.nextInt();

        System.out.println("Enter first number : ");
        int d = sc.nextInt();

        System.out.println("Enter first number : ");
        int e = sc.nextInt();

        if(a>b && a>c && a>d && a>e){
            System.out.println("A is Greater");
        }
        else if(b>a && b>c && b>d && b>e){
            System.out.println("B is Greater");
        }
        else if(c>a && c>b && c>d && c>e){
            System.out.println("C is Greater");
        }
        else if(d>a && d>b && d>c && d>e){
            System.out.println("D is Greater");
        }
        else{
            System.out.println("E is Greater");
        }
    }
}
