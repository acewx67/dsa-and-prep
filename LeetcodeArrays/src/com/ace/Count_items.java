package com.ace;

import java.util.ArrayList;
///////giving wrong output!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Count_items {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list_2d = new ArrayList<ArrayList<String>>();
        ArrayList<String> list_1d1 = new ArrayList<>();
        ArrayList<String> list_1d2 = new ArrayList<>();
        ArrayList<String> list_1d3 = new ArrayList<>();
        list_1d1.add("phone");
        list_1d1.add("blue");
        list_1d1.add("pixel");
        list_1d2.add("computer");
        list_1d2.add("silver");
        list_1d2.add("phone");
        list_1d3.add("phone");
        list_1d3.add("gold");
        list_1d3.add("iphone");
        list_2d.add(list_1d1);
        list_2d.add(list_1d2);
        list_2d.add(list_1d2);
//        System.out.println(list_2d);
        String ruleKey = "color";
        String ruleValue = "silver";
        int num = -1;
        if(ruleKey == "type"){
            num = 0;
        }
        else if(ruleKey == "color"){
            num = 1;
        }
        else if(ruleKey == "name"){
            num = 2;
        }
        int count = 0;
        for (int i = 0; i < list_2d.size(); i++) {
            if (list_2d.get(i).get(num).contains(ruleValue)) {
                count++;
            }
        }
        System.out.println(list_2d.get(num));
        System.out.println(count);
    }
}
