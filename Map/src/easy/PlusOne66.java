package easy;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int [] ans(int [] arr) {
        int num = 0;
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i] * Math.pow(10, size - 1);
            size--;
        }
        num = num + 1;
        int digits = (int) Math.log10(num) + 1;
        if (digits > arr.length - 1) {
            int[] digs = new int[digits];
            for (int i = 0; i < digits; i++) {
                digs[digs.length - 1 - i] = num % 10;
                num /= 10;
            }
            return digs;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = num % 10;
            num /= 10;
        }
        return arr;
    }
}
