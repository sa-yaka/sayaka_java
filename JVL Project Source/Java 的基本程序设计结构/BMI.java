import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your height(m): ");
        float height = in.nextFloat();

        System.out.print("Enter your weight(kg): ");
        float weight = in.nextFloat();

        in.close();

        float BMI = weight / (height * height);
        System.out.printf("Your BMI is :%.2f", BMI);
    }
}
