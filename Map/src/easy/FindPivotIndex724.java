package easy;

public class FindPivotIndex724 {
    public static void main(String[] args) {
        int [] arr = {2,1,-1};
        System.out.println(pivot_index(arr,0));
    }
    static int pivot_index(int [] arr,int pivot){
        if(pivot >= arr.length){
            return -1;
        }
        int left_sum = 0;
        {
            int i = 0;
            while(i < pivot){
                left_sum += arr[i];
                i++;
            }
        }
        int right_sum = 0;
        {
            int i = arr.length-1;
            while(i > pivot){
                right_sum += arr[i];
                i--;
            }
        }
        if(left_sum == right_sum){
            return pivot;
        }
        return pivot_index(arr,pivot+1);
    }
}
