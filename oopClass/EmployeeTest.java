import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        // 构建一个数组，并填入三个对象
        _Employee[] staff = new _Employee[3];

        staff[0] = new _Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new _Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new _Employee("Tony Tester", 40000, 1990, 3, 15);

        // 使用 _Employee 的 raiseSalary() 使每个员工的工资增加 5%
        for (_Employee e : staff) {
            e.raiseSalary(5);
        }

        // 遍历 staff 打印员工信息
        for (_Employee e : staff) {
            System.out.println("name= " + e.getName() + ",salary= " + e.getSalary()
                    + ", hireDay= " + e.getHireDay());
        }
    }
}

class _Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    // 构建 _Employee 数组
    public _Employee(String n, double s, int year, int month, int day) {
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