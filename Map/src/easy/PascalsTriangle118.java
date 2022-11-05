package easy;

import java.util.ArrayList;

public class PascalsTriangle118 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n ; i++) {
            ArrayList <Integer> temp = new ArrayList<Integer>();
            for(int in = 0; in <= i ;in++){
                if(in == 0 || in == i){
                    temp.add(1);
                }
                else {
                    int li = list.get(i - 1).get(in - 1);
                    int ri = list.get(i - 1).get(in);
                    temp.add(li + ri);
                }
            }
            list.add(temp);
        }
        System.out.println(list);

    }
}
