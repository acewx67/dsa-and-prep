package easy;

public class BestTimetoBuySellStock121 {
    public static void main(String[] args) {
    int [] arr = {7,1,5,3,6,4};
        System.out.println(max(arr));
    }
    static int max(int [] arr){
        int min = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
            max_profit = Math.max(arr[i]-min,max_profit);
        }
        return max_profit;
    }

}
