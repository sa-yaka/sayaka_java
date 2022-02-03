import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        in.close();

        double stra = Double.parseDouble(a);
        double strb = Double.parseDouble(b);

        System.out.print(stra + strb);
    }
}
