import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Integer.MIN_VALUE;
        if(a >= b) {
            max = a;
        }if(max <= c) {
            max = c;
        }

        System.out.println("Largest number is " + max);
        /*
        or we can use Math.max(var,var);
         */
    }
}
