package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//DOESN"T WORK FOR ARRAYS THAT CONTAIN DUPLICATE ELEMENTS;
public class TwoSumFullOpt {
    public static void main(String[] args) {
        int []arr = {3,3};
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(two(map,arr,target,0,arr.length-1)));
    }
    static int [] two(Map<Integer,Integer> map,int [] arr,int target,int li,int ri){
        while(li < ri){
            if(arr[li] + arr[ri] == target){
                return new int [] {map.get(arr[li]),map.get(arr[ri])};
            }
            else if(arr[li] + arr[ri] > target){
                ri--;
            }
            else if(arr[li] + arr[ri] < target){
                li++;
            }

        }
        return new int [] {-1,-1};
    }
}