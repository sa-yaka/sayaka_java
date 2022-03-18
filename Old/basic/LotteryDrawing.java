import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many unmbers do you need to draw? ");
        int k = in.nextInt(); // 多少次

        System.out.print("What is the highest number your can draw? ");
        int n = in.nextInt(); // 一共多少
        in.close();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) { // 池
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) { // 抽出的
            int r = (int) (Math.random() * n); // 随即浮点数
            result[i] = numbers[r];
            numbers[r] = numbers[r - 1];
            n--;
        }

        Arrays.sort(result); // 排序
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result) {
            System.out.println(r); // 输出结果
        }
    }
}
