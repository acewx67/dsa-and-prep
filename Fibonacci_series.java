import java.util.Scanner;
//we have to find the nth Fibonacci series number
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        //Fibo series
        for(int i=0;i<n;i++) {

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
        }
    }

