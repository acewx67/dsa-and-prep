package com.ace;

public class CeilingLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'f';
        System.out.println(ceiling(arr, target));
    }

    static char ceiling(char[] arr, char target) {   //must return the ceiling
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        if (arr[end] == target || target > arr[end]) {
            return arr[0];
        }
        while (start <= end) {
            mid = (start + end) / 2;
            int next = mid + 1;
            if (arr[mid] == target) {
                int temp = mid;
                while (temp < arr.length) {
                    if (arr[temp] > target) {
                        return arr[temp];

                    }
                    temp++;
                }
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return arr[start];

    }
}

