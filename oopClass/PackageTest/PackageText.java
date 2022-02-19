import com.horstmann.corejava.Employee;

public class PackageText {
    public static void main(String[] args) {
        var harry = new Employee("harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);
        System.out.println("His name is, " + harry.getName() + " salary is"
                + harry.getSalary());
    }
}
