import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter("test.txt", StandardCharsets.UTF_8);
        int i = 0;
        while (i <= 100) {
            out.println("Hello, World.\tHello, World.\tHello, World.\tHello, World.");
            i++;
        }
        out.close();

/*
        Scanner in = new Scanner(Path.of("test.txt"), StandardCharsets.UTF_8);
        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println(line);

        }
*/
    }
}