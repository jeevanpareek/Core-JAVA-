import java.util.*;

public class K {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        if(a%5 == 0 && a%11 == 0){
            System.out.println("Number is divisible by 5&11");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    
}
