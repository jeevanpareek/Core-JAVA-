import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        System.out.println("Enter Range : ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            System.out.println("The table of "+ i +" is : ");
            for(int j=1;j<=10;j++){
                System.out.println(i*j +" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
