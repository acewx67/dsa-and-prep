package easy;

import java.util.ArrayList;
//Just try to debug the code using debug tool
public class PascalTrianglePractise {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n ; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else{
                    int l = list.get(i-1).get(j-1);
                    int r = list.get(i-1).get(j);
                    temp.add(j,l + r);
                }
            }
            list.add(temp);
        }
        for (ArrayList<Integer> nums:
             list) {
            System.out.println(nums);
        }
    }

}
