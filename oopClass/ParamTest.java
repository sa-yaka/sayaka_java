public class ParamTest {
    public static void main(String[] args) {
        System.out.println("\nTesting tripleValue");
        double percent = 10;
        System.out.println("Before: percent= " + percent);
        tripleValue(percent);
        System.out.println("After: percent= " + percent);
        // 不能修改

        System.out.println("\nTesting tripleSalary:");
        var harry = new SwapEmployee("Harry", 50000);
        System.out.println("Before: salary= " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary= " + harry.getSalary());
        // x.raiseSalary(200) 可以修改值（harry）

        System.out.println("\nTesting swap: ");
        var a = new SwapEmployee("Alice", 70000);
        var b = new SwapEmployee("Bob", 60000);
        System.out.println("Befor: a= " + a.getName());
        System.out.println("Befor: b= " + b.getName());
        swap(a, b);
        System.out.println("After: a= " + a.getName());
        System.out.println("After: b= " + b.getName());
        // 只修改了 x, y 的值。a, b 的值没有改变
    }

    public static void tripleValue(double x){
        x = 3 * x;
        System.out.println("End of method: x= " + x);
    }

    public static void tripleSalary(SwapEmployee x){
        x.raiseSalary(200);
        System.out.println("End of method: salary= " + x.getSalary());
    }

    public static void swap(SwapEmployee  x, SwapEmployee y){
        SwapEmployee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x= " + x.getName());
        System.out.println("End of method: y= " + y.getName());
    }
}

class SwapEmployee {
    private String name;
    private double salary;

    public SwapEmployee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}