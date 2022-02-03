import java.util.Scanner;

public class CharGet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 利用charAt(n);方法,这个方法可以返回字符串第n个位置的字符。
        char character = in.next().charAt(0);
        System.out.println((int) character);
        in.close();
    }
}
