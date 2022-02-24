package Solution;

import java.io.File;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
            String inputDir = args[0];
            String outputDir = args[1];

            if (!outputDir.endsWith("/")) {
                outputDir = outputDir + "/";
            }

            List<String> inputFilePaths = new ArrayList<>();
            File[] inputFiles = new File(inputDir).listFiles();

            for (File file : inputFiles) {
                if (file.getPath().endsWith(".in")) {
                    inputFilePaths.add(file.getPath());
                }
            }

            Collections.sort(inputFilePaths, new Comparator<String>() {
                @Override
                public int compare(String f1, String f2) {
                    int f1num = Integer.parseInt(new File(f1).getName()
                            .replace(".in", ""));
                    int f2num = Integer.parseInt(new File(f2).getName()
                            .replace(".in", ""));
                    return f1num - f2num;
                }
            });

            for (String inputFilePath : inputFilePaths) {
                Scanner in = new Scanner(new FileReader(inputFilePath));
                String outputFilename = new File(inputFilePath).getName()
                        .replace(".in", ".out");
                PrintWriter writer = new PrintWriter(outputDir + outputFilename,
                        "UTF-8");
                String stdoutPath = outputDir + outputFilename.replace(".out",
                        ".stdout");
                PrintStream stdout = new PrintStream(stdoutPath);
                System.setOut(stdout);
                PrintStream stderr = new PrintStream(outputDir + outputFilename
                        .replace(".out", ".stderr"));
                System.setErr(stderr);
                String[] params = in.nextLine().split(" ");

                Solution test = new Solution();
                int[] arrays = new int[params.length];

                for (int i = 0; i < params.length; i++) {
                    arrays[i] = Integer.parseInt(params[i]);
                }

                int[] rounding = test.rounding(arrays);
                writer.println(Arrays.toString(rounding));
                writer.close();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}