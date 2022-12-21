package com.ace;

import java.util.ArrayList;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 13;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if(i * i >= n) break;
            list.add(i * i);
        }
        System.out.println(list);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        perfect(list,new ArrayList<>(),res,n,0,n);
        for (ArrayList<Integer> t:
             res) {
            System.out.println(t);
        }




    }
    static ArrayList<Integer> perfect(ArrayList<Integer> list,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> res,int potAns,int num,int n){
        if(potAns < 0){
            ans.clear();
            return ans;
        }

        if(potAns == 0){
            return ans;
        }
        for (int t:
             list) {
            ans.add(t);

            if(perfect(list,ans,res,potAns-t,t,n) != null && !perfect(list,ans,res,potAns-t,t,n).isEmpty()){
                res.add(perfect(list,ans,res,potAns-t,t,n));
            }
//            if(ans.size() > 0) ans.remove(ans.size()-1);




        }
        return null;



    }

}
