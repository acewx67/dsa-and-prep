import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        float celsius = input.nextFloat();
        float farenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in farenheit is " + farenheit);

    }
}
