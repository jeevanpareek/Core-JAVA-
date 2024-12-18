import java.util.*;

class A{
    void odd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        if(a%2!=0){
            System.out.println(a+ " is a odd number");
        }
        else{
            System.out.println(a+ " is a even number");
        }
        
        sc.close();
    }
   
}
public class O6{
    public static void main(String[] args) {
        A p = new A();
        p.odd();
    }
}