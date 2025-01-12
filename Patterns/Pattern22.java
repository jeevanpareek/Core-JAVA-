import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no. : ");
        int n = sc.nextInt();

        int m=n-1;

        for(int i=1;i<=(2*n)-1;i++){
            System.out.print("*"+" ");   
        }
        System.out.println();
        for(int i=1;i<=n;i++){
              

            for(int j=m;j>=i;j--){
                System.out.print("*"+" ");
            }
            for(int s=1;s<=(2*i)-1;s++){
                System.out.print(" "+" ");
            }
            for(int j=m;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        sc.close();

    }
}
