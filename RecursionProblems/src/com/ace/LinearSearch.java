package com.ace;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1,2,7,7,5,6};
        int target = 7;
        System.out.println(searchall(arr,target));
    }
    static int search(int []arr,int target){
        return helper(arr,0,target);
    }
    private static int helper(int [] arr,int i,int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return helper(arr,i+1,target);
    }



    static int searchlast(int []arr,int target){
        return helperlast(arr,arr.length-1,target);
    }
    private static int helperlast(int [] arr,int i,int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return helperlast(arr,i-1,target);
    }


//to search for duplicate elements
    static ArrayList<Integer> searchall(int []arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        return helperall(arr,0,target,list);
    }
    private static ArrayList<Integer> helperall(int [] arr,int i,int target,ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return helperall(arr,i+1,target,list);
    }

    //one more way to write the above code
    static ArrayList<Integer> Findall(int []arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return Findall(arr,target,index+1,list);
    }

    //one more unoptimized peculiar method
    static ArrayList<Integer> Findall2(int []arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = Findall(arr,target,index+1,list);
        list.addAll(ans);
        return list;
        //here we are creating new list in every recursive function call,and when the list is being returned after hitting
        //boundary condition all the lists are added in every function as the functions finish their code/task
        //might be useful in some problems, but in this case its not suitable and can be done in a lot more optimized way
    }
}
