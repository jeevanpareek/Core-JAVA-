import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter height in centimeters");
        int a = sc.nextInt();

        if(a<=155){
            System.out.println("Your height is too short !! Do some stretching");
        }
        else if(a>155 && a<=170){
            System.out.println("Your height is average !!");
        }
        else{
            System.out.println("You are tall");
        }
        sc.close();
    }
    
}
