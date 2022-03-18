package interfaces;

import java.util.Arrays;

public class EmployeeSortText {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tont Tester", 38000);

        Arrays.sort(staff);
        
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + "salary = " + e.getSalary());
        }
    }
}