import java.util.*;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("%d is even" +a);
        }
        else{
            System.out.println("%d is odd" +a);
        }
    }
    
}
