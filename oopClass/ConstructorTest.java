import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new AllEmployee[3];

        staff[0] = new AllEmployee("Harry", 40000);
        staff[1] = new AllEmployee(60000);
        staff[2] = new AllEmployee();

        for(AllEmployee e : staff){
            System.out.println("name= " + e.getName() + " ,id= " + e.getId()
                + " ,salary= " + e.getSalary());
        }
    }
}

class AllEmployee{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static{
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public AllEmployee(String aName, double aSalary){
        name = aName;
        salary = aSalary;
    }

    public AllEmployee(double aSalary){
        this("AllEmployee #" + nextId, aSalary);
    }

    public AllEmployee(){
        // name = ""
        // salary = 0
        // id = nextID (?)
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}
