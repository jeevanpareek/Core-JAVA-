import java.util.Scanner;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int table = 1
        ;

        while(table<=10){
            System.out.println(+a+"x"+table+"="+table*a);
            table++;
        }
        sc.close();
    }
    
}
