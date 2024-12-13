import java.util.*;

public class I {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc.nextInt();

        if(a<0){
            System.out.println("Number is negative");
        }
        else if(a>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("zero");
        }
    }
    
}
