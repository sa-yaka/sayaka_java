public class LengthCodePointCount {
    public static String greeting = "Hello\uD835\uDD46"; // 𝕆

    public static void main(String[] args) {
        int unCode = greeting.length();                            // 码元个数 常用字符集一个码元，辅助字符集两个码元。
        System.out.println(greeting + " code unit is " + unCode);

        for (int i = 0; i < 5; i++) {
            System.out.print("==");
        }

        int cp = greeting.codePointCount(0, greeting.length());
        System.out.println("\nThe code Point is " + cp);           //码点个数，一个 Unicode 字符就是一个码点。

        for (int i = 0; i < 5; i++) {
            System.out.print("==");
        }

        char first = greeting.charAt(0);
        char last = greeting.charAt(greeting.length() - 1);

        System.out.println("\nThe first code unit is " + first );
        System.out.println("The last code unit is " + last);
    }

}

// 测试 码元 码点 length codePointCount charAt offsetByCodePoints codePointAt