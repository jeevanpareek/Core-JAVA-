import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print((2*j)-1);
            }
            System.out.println();
        }
    }   
}
// 1
// 13
// 135
// 1357
// 13579
