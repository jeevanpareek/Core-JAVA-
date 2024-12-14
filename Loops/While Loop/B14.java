import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        int table = 1
        ;

        while(table<=11){
            System.out.println(table*a);
            table++;
    
        }
        sc.close();
    }
    
}
