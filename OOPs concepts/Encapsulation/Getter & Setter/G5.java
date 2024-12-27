class Rectangle{
    private double length = 20;
    private double width = 30;
    private double area;
    
    double get1(){
        return length;
    }
    double get2(){
        return width;
    }
    double get3(){
        area = length*width;
        return area;
    }
}
public class G5 {
    public static void main(String[] args) {
        Rectangle p = new Rectangle();
        System.out.println(p.get1());
        System.out.println(p.get2());
        System.out.println(p.get3());
    }
}
