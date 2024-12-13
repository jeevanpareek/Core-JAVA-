import java.util.*;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics marks : ");
        int a = sc.nextInt();

        System.out.println("Enter Chemistry marks : ");
        int b = sc.nextInt();

        System.out.println("Enter Maths marks : ");
        int c = sc.nextInt();

        System.out.println("Enter English marks : ");
        int d = sc.nextInt();

        System.out.println("Enter Computer marks : ");
        int e = sc.nextInt();
        int total=a+b+c+d+e;
        int h=total/5;
        int f=h*100;
        float percent =f/100;

      // System.out.println(percent);
       char grade='a';

       if(percent <=25){
           grade = 'F';
       }
       else if(percent >25 && percent <=45){
           grade = 'E';
       }
       else if(percent >45 && percent <=50){
           grade = 'D';
       }
       else if(percent >50 && percent <=60){
           grade = 'C';
       }
       else if(percent >60 && percent <=80){
           grade = 'B';
       }
       else if(percent >80){
           grade = 'A';
       }
       else{
           System.out.println("Fail");
       }
       System.out.println("Your percentage is "+percent +" and your grade is "+grade);
    }
    
}
