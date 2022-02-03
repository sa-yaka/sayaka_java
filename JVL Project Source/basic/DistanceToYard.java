import java.util.Scanner;

public class DistanceToYard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distance (in LONG): ");
        double distance = in.nextDouble();
        in.close();
        System.out.printf("The distance " + distance + " long is " + distance * 220 + "yard.");
    }
}
