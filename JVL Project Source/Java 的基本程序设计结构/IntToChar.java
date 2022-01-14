import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 127 || n < 0) {
            System.out.println("error");
        } else {
            System.out.println((char) n);
        }
    }
}
