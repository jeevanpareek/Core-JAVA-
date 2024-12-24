class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    int get1(){
        return id;
    }
    String get2(){
        return name;
    }
}
public class G2 {
    public static void main(String[] args) {
        Student p = new Student(1526, "Jeevan");
        System.out.println(p.get1());
        System.out.println(p.get2());
    }
}
