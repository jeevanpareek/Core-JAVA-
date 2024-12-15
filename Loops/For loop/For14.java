import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you want");
        String s = sc.next();

        if(s.equals("armstrong")){

            System.out.print("Enter Number : ");
            int a = sc.nextInt();
            int sum = 0;
            int rem = 0;
            int temp = a;

            while(a>0){
                rem = a%10;
                sum = sum+rem*rem*rem;
                a = a/10;
            }
            if(temp == sum){
                System.out.println(+temp+" is armstrong ");
            }
            else{
                System.out.println(+temp+" is not armstrong");
            }

        }
        else if(s.equals("pallindrome")){
            System.out.print("Enter Number : ");
            int a = sc.nextInt();
            int sum = 0;
            int rem = 0;
            int temp = a;

            while(a>0){
                rem = a%10;
                sum = sum*10+rem;
                a = a/10;
            }
            if(temp == sum ){
                System.out.println(+temp+" is a pallindrome number");
            }
            else{
                System.out.println(+temp+" is not a pallindrome number");
            }
        }
        else if(s.equals("reverse")){
            System.out.println("Enter number : ");
            int a = sc.nextInt();

            int sum = 0;
            int rem = 0;

            while(a>0){
                rem = a%10;
                sum = sum*10+rem;
                a = a/10;
            }
            System.out.println(+sum+" ");
        }
        else if(s.equals("factorial")){
            System.out.println("Enter number : ");
            int a = sc.nextInt();

            int fact = 1;
            int i = 1;
            while(i<=a){
                fact = fact*i;
                i++;
            }
            System.out.println(" The factorial of a given number is "+fact);
        }
        sc.close();
    }
    
}
