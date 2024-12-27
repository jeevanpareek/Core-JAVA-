class A{
    A(){
        System.out.println("hello");
    }
    A(int a){
        System.out.println("you");
    }
    A(float b){
        System.out.println("are");
    }
    A(char c){
        System.out.println("buffalo");
    }
}
public class I3 {
    public static void main(String[] args) {
        new A();
        new A(45);
        new A(22.2f);
        new A('J');
    }
}
