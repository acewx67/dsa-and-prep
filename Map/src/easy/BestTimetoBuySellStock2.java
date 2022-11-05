package easy;
//122. Best Time to Buy and Sell Stock II
public class BestTimetoBuySellStock2 {
    public static void main(String[] args) {
        int [] arr = {7,6,4,3,1};
        int i = 0;
        int profit = 0;
        while(i < arr.length-1){
            if( arr[i+1] > arr[i]){
                profit += arr[i+1] - arr[i];
            }
            i++;
        }
        System.out.println(profit);
    }
}
