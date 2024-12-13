import java.util.*;

public class A2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type");
        String s = sc.next();

        if(s . equals("celcius")){

            System.out.println("Enter temperature is celcius");
            int a = sc.nextInt();

            int f = (a*9/5)+32;

            System.out.println(f);

        }
        else if(s. equals("farheneit")){
            
            System.out.println("Enter temperature is Farhenit");
            int b = sc.nextInt();

            int c = (b-32)*5/9;

            System.out.println(c);
        }
        else{
            System.out.println("Invalid input");
        }

    }
    
}
