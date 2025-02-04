class A{
    static class B{
        static B show(){
            System.out.println("Hello");

            return new B();
        }
    }
}
public class Q2 {
   public static void main(String[] args) {
    A.B.show();
   } 
}
