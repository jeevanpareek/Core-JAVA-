import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose one from the given options : \n 1. even   2. odd");
        String s = sc.next();

        if(s.equals("even")){
            System.out.print("Enter Starting point : ");
            int a = sc.nextInt();

            System.out.print("Enter Ending point : ");
            int b = sc.nextInt();

            for(int i=a;i<=b;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        else if(s.equals("odd")){
            System.out.print("Enter starting point : ");
            int a = sc.nextInt();

            System.out.print("Enter ending point : ");
            int b = sc.nextInt();

            for(int i=a;i<=b;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Please choosse the right option !!");
        }
        sc.close();
    }    
}
