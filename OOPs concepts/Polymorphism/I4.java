class A{
    A(){
        this("Apple");
        System.out.println("Hi");
    }
    A(int a){
        this(12.20);
        System.out.println("I"+a);
    }
    A(char c){
        System.out.println("am"+c);
    }
    A(float f){
        this('J');
        System.out.println("Jeevan"+f);
    }
    A(String s){
        this(20.2f);
        System.out.println("Pareek"+s);
    }
    A(double g){
        this();
        System.out.println("Regex"+g);
    }
}
public class I4{
    public static void main(String[] args) {
        new A(20);
    }
}