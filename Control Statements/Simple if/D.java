import java.util.*;

public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a = sc.nextInt();

        if(a>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }


    }
    
}
