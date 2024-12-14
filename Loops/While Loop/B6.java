import java.util.Scanner;

public class B6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();

        while(a<=500){
            System.out.print(a+" ");
            a++;
        }
        sc.close();

    }
    
}
