import java.util.Scanner;

class A{
    void even(int a){
        if(a%2!=0){
            System.out.println(a+ " is an odd number");
        }
        else{
            System.out.println(a+ " is an even number" );
        }
    }

}
public class N4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();

        A p = new A();
        p.even(a);
    }
}
