package Employee1;
import java.util.TreeSet;
public class Main {
    public static void main(String[]args){
        TreeSet<Employee> emp=new TreeSet<Employee>();
        emp.add(new Employee("Swastik",5));
        emp.add(new Employee("Batman",6));
        emp.add(new Employee("Kimpix",4));
        emp.add(new Employee("Parrot",1));
        emp.add(new Employee("Alpha",2));
        System.out.println(emp);
    }
}
