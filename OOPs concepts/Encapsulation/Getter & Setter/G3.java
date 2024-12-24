// Write a class Book with a private field price (double). Use a setter method to set the price and a getter method to retrieve the price.
class Book{
    private double price;
    void set1(double price){
        this.price = price;
    }
    double get1(){
        return price;
    }
}
public class G3 {
    public static void main(String[] args) {
        Book p = new Book();
        p.set1(1500.00);
        System.out.println(p.get1());
    }
}
