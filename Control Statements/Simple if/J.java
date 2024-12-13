import java.util.*;

public class J {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter character : ");
    char b = sc.next().charAt(0);

    if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){
        System.out.println("vovel");
    }
    else{
        System.out.println("consonant");
    }



 }   
}
