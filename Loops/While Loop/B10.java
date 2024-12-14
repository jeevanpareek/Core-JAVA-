import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in)   ;

     System.out.println("Enter the starting number :");
     int a = sc.nextInt();

     System.out.println("Enter the ending number :");
     int b = sc.nextInt();

     while(a<=b){
        if(a%2==0){

            System.out.print(a+" ");
        }
        a++;
     }
     sc.close();
    }
    
}
