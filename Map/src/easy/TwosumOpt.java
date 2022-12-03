package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwosumOpt {

    public static void main(String[] args) {

        int [] arr = {3,3};
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(two(map,arr,target)));

    }
    static int [] two(Map<Integer,Integer> map,int [] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])){
                return new int[]{i,map.get(target-arr[i])};
            }
        }
        return new int [] {-1,-1};
    }
}
