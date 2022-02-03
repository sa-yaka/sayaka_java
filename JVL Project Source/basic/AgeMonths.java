import java.util.Scanner;

public class AgeMonths {
    public static void main(String[] args) {
        System.out.print("Ehter your age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        in.close();

        System.out.print("You age " + age + " old, or " + 12 * age
                + " months old.\n");
    }
}
