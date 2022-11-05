package easy;

public class FibonacciOptDynamicProgramming {
    public static void main(String[] args) {
        System.out.println(fibo(49,new int [51] ));
//        System.out.println(fibonacci(49));
    }
    static int fibo(int n, int [] dp){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fibo(n -1,dp) + fibo(n-2,dp);
        return dp[n];
    }
    static int fibonacci(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
