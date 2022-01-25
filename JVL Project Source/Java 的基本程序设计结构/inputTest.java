import java.util.*;

public class inputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = in.nextLine();

        System.out.print("Enter your age : ");
        int age = in.nextInt();
        in.close();
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
