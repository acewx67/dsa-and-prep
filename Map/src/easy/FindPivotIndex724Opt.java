package easy;

import java.util.Arrays;

public class FindPivotIndex724Opt {
    public static void main(String[] args) {
        int [] arr = {1,7,3,6,5,6};
        int [] left_runsum = new int [arr.length];
        int [] right_runsum = new int [arr.length];
        {int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                left_runsum[i] = sum;
            }
        }
        {int sum = 0;
            for (int i = arr.length-1; i >= 0; i--) {
                sum += arr[i];
                right_runsum[i] = sum;
            }
        }
        System.out.println(Arrays.toString(left_runsum));
        System.out.println(Arrays.toString(right_runsum));
        int i = 0;
        while(i < arr.length){
            if(left_runsum[i] == right_runsum[i]){
                System.out.println(i);
            }
            i++;
        }
    }
}
