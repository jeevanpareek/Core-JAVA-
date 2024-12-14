import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the positive number : ");
        int a = sc.nextInt();

        if(a>0){

            
            for (int i = 1; i<=10;i++){
                System.out.println(+a*i);
            }
           
       }
       else{
        System.out.println("Enter a valid number!!");
    }
        sc.close();
    }
    
}
