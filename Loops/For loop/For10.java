import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();

        for(int i=1;i<=100;i++){
            if(i%(a*b)==0){
                System.out.println(i+" ");
            }
        }
        sc.close();
    }
    
}
