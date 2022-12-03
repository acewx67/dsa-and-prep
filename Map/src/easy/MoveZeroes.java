package easy;

import java.util.Arrays;
//BRUTE FORCE METHOD
public class MoveZeroes {
    public static void main(String[] args) {
        int []arr = {0,1,0,3,12};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void move(int [] arr){
        int last_zero = arr.length-1;
        int end = arr.length-1;
        for (int i = end; i > 0 ; i--) {
            if(arr[i-1] == 0 ){
                swap(arr,i-1,i,last_zero);
                last_zero--;
            }
            end--;
        }
    }
    static void swap(int [] arr,int a,int b,int swap_till){
        if(a == swap_till){
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        swap(arr,a+1,b+1,swap_till);
    }
}
