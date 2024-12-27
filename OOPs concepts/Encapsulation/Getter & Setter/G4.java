// In the Employee class, create a setter for the salary field (double).
// Ensure that the salary cannot be set to a negative value. If the value is invalid, set it to 0.
class Employee{
    private double salary;

    void set(double salary){
        if(salary<=0){
        }
        else{
            this.salary = salary;
        }
    }
    double get(){
        return salary;
    }
}
public class G4 {
    public static void main(String[] args) {
        Employee p = new Employee();
        p.set(120000);

        System.out.println(p.get());
    }
}
