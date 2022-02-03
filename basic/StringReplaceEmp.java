public class StringReplaceEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
//      substring 方法
        System.out.println(str.substring(0, 5) + " Java");
        for (int i = 0; i < 5; i++) {
            System.out.print("==");
        }
        System.out.println("\n" + str);
//      Java replace() 方法
        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println(str.replaceAll("He", "Ha"));
    }
}

