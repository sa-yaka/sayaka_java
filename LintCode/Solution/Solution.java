package Solution;

public class Solution {
    public int[] rounding(int[] array) {
        // write your code here
        for (int i = 0; i< array.length; i++) {
            if(array[i]>0){
                array[i] = array[i] / 10 * 10 + ( array[i] % 10 > 4 ? 10 : 0);
            }
        }
        return array;
    }
}