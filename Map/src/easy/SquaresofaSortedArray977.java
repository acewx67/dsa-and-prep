package easy;

import java.util.Arrays;

public class SquaresofaSortedArray977 {
    public static void main(String[] args) {
        int [] arr = {-4,-1,0,3,10};
        int [] ans = new int [arr.length];
        int l = 0;
        int r = arr.length-1;
        int i = ans.length-1;
        while(l <= r){
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                ans[i] =  arr[l]*arr[l];
                l++;
            }
            else {
                ans[i] = arr[r]*arr[r];
                r--;
            }
            i--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
