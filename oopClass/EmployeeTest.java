import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        // 构建一个数组，并填入三个对象
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // 使用 Employee 的 raiseSalary() 使每个员工的工资增加 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // 遍历 staff 打印员工信息
        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + ",salary= " + e.getSalary()
                    + ", hireDay= " + e.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    // 构建 Employee 数组
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}