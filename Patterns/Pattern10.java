import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int b = sc.nextInt();
          int n = b;

        for(int i=1;i<=b;i++){
            for(int j=n;j>=1;j--){
                System.out.print((char)(j+64)+" ");
            }
              n--;
            System.out.println();
        }
        sc.close();
    }
    
}
