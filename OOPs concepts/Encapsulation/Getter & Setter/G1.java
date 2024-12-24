class A{
    String name; int age;

    void set1(String name, int age){
        this.name=name;
        this.age=age;
    }
    String get1(){
        return name;
    }
    int age(){
        return age;
    }
}

public class G1{
    public static void main(String[] args) {
        A p = new A();
        p.set1("Jeevan", 20);
        System.out.println(p.get1());
        System.out.println(p.age());
    }
}