import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : " );
        int a = sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print((char)(j+64)+" ");
                }
                else if(i%2!=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
