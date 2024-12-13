import java.util.*;

public class L {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character : ");
        char A = sc.next().charAt(0);

        if(A>='a' && A<='z'){
            System.out.println("Lowercase");
        }
        else if(A>='A' && A<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Invalid input !!");
        }
    }
    
}
