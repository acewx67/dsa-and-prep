package com.ace;

public class Max_population {
    public static void main(String[] args) {
        int[][]arr = {{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
        int max = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int population = 0;  //number of people alive at that year(no. of indexes)
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][0] >= arr[j][0] && arr[i][0] < arr[j][1]){
                    population++;
                }
            }
            if(population >= max){
                max = population;
                ans = arr[i][0];
            }
        }
        System.out.println(ans);
    }
}
