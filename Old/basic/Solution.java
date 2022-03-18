import java.util.Scanner;

public class Solution {
    public static String add(String a, String b) {
        // write your code here

        double floatA = Double.parseDouble(a);
        double floatB = Double.parseDouble(b);

        String str = Double.toString(floatA + floatB);

        return str;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        in.close();
        System.out.println(add(a, b).substring(0, 4));
    }
}