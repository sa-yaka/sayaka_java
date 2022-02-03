public class arrayLength {
    public static void main(String[] args) {
        int[] a = new int [20];
        a[0] = 5;
        a[1] = 4;
        a[2] = 3;
        a[3] = 13;
        a[4] = 4;
        a[5] = 34;
        a[6] = 34;
        a[7] = 45;
        a[8] = 99;
        a[9] = 11123;
        
        System.out.println("for 循环数组");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("\nforeach 循环数组");
        for (int element : a) {
            System.out.println(element);
        }
    }
}
