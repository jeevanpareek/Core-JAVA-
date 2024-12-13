import java.util.*;

public class O {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter character");
    char A = sc.next().charAt(0);

    if(A=='m'){
        System.out.println("Congrats !! You are male");
    }
    else if(A=='f'){
        System.out.println("Congrats!! You are female");
    }
    else {
        System.out.println("You are transgender");
    }
    
}
}