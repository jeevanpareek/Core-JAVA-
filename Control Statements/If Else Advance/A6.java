import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the roll no of the student : ");
        int a = sc.nextInt();

        System.out.print("Enter student name : ");
        String s = sc.next();

        System.out.print("Enter student's father name : ");
        String b = sc.next();

        System.out.print("Enter student's mother name : ");
        String c = sc.next();

        System.out.print("Enter student's address of residence : ");
        String d = sc.next();

        System.out.print("Enter student's contact number : ");
        long e = sc.nextLong();

        System.out.print("Enter marks of Physics : ");
        int f = sc.nextInt();

        System.out.print("Enter marks of Chemistry : ");
        int g = sc.nextInt();

        System.out.print("Enter marks of Computer Application : ");
        int h = sc.nextInt();

        int total = f+g+h;

        float i = total/3;

        float j = i*100;

        float percent = j/100;

        int division = 1 ;

        if(percent >=60){
            division = 1;
        }
        else if(percent >= 45 && percent <=59){
            division = 2;
        }
        else{
            division = 3;
        }
        System.out.println("\n\n\n\n Roll no : " +a+ "\n Student's name : " +s+ "\n Father's name : " +b+
         "\n Mother's name : " +c+ "\n Address : " +d+ "\n Contact no. : " +e+ "\n Physics marks : " +f+
          "\n Chemistry marks : " +g+ "\n Computer Marks : " +h+ "\n Total : " +total+ "/300\n Percentage : "+percent+ "\n Division : " +division );
        sc.close();
    }
}
