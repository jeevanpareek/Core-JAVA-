import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter shape : ");
        String s = sc.next();

        if(s . equals("Triangle")){

            System.out.println("Enter the parameter you want");
            String a = sc.next();

            if(a.equals("Area")){

                System.out.print("Enter base :");
                int v = sc.nextInt();

                System.out.println("Enter height");
                int x = sc.nextInt();

                int area = (1/2)*v*x;
                System.out.println("The area is  : " +area);
            }
            else if(a.equals("Volume")){

                System.out.println("volume");
            }
        }
        else if(s . equals("Square")){

            System.out.println("Enter the parameter you want");
            String a = sc.next();

            if(a.equals("Area")){

                System.out.print("Enter base :");
                int v = sc.nextInt();

                int area = v*v;
                System.out.println("The area is  : " +area);
            }
            else if(a.equals("Volume")){

                System.out.println("volume");
            }
        }
        else if(s . equals("Rectangle")){

            System.out.println("Enter the parameter you want");
            String a = sc.next();

            if(a.equals("Area")){

                System.out.print("Enter Length :");
                int v = sc.nextInt();

                System.out.println("Enter Breadth");
                int x = sc.nextInt();

                int area = v*x;
                System.out.println("The area is  : " +area);
            }
            else if(a.equals("Volume")){

                System.out.println("volume");
            }
        }
        else{
            System.out.println("Invalid Input!!");
        }
        
    }
}
