public class StaticTest {
    public static void main(String[] args) {
        var staff = new TestEmployee[3];
        staff[0] = new TestEmployee("Tom", 40000);
        staff[1] = new TestEmployee("Dick", 60000);
        staff[2] = new TestEmployee("Harry", 65000);

        for (TestEmployee e : staff) {
            e.setId();
            System.out.println("name: " + e.getName() + ",id: " + e.getId()
                    + ",salary: " + e.getSalary());
        }

        int n = TestEmployee.getNextId();
        System.out.println("Next available id= " + n);
    }
}

class TestEmployee {
    private static int nextID = 1;

    private String name;
    private double salary;
    private int id;

    public TestEmployee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextID;
        nextID++;
    }

    public static int getNextId() {
        return nextID;
    }

    public static void main(String[] args) {
        var e = new TestEmployee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}