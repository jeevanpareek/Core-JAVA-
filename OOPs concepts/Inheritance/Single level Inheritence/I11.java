class A{
    public int a = 100;
}
class B extends A{
   void show(){
       System.out.println(a);
   }
}
public class I11 {
   public static void main(String[] args) {
       B p = new B();
       p.show();
   }
}
