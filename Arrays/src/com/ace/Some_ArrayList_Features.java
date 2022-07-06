package com.ace;

import java.util.ArrayList;

public class Some_ArrayList_Features {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add new elements
        list.add(12);
        list.add(89);
        list.add(179);
        System.out.println(list);

        //remove elements
        list.remove(1); //removes index = 1's value i.e removes 89
        System.out.println(list);

        //get specific elements
        int num = list.get(0); //gets the value at index=0
        System.out.println(num);
        System.out.println(list.get(0)); //can also use it like this

        //update the list elements
        list.set(0,99); //updates 0th index value i.e 12 to 99
        System.out.println(list);

        //check for an element value
        boolean check = list.contains(179); //gives true if it contains 179 else gives false
        System.out.println(check);
        System.out.println(list.contains(179)); //can also use it like this
    }
}
