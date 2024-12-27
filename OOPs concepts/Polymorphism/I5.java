class A{
    void show(){
        System.out.println("Hello World");
    }
    void show1(){
        System.out.println("I am Jeevan Pareek");
    }
}
class B extends A{
    void show2(){
        System.out.println("Hi !!");
    }
}
public class I5 {
    public static void main(String[] args) {
        A p = new B();
        p.show();
        p.show1();
    }
}
