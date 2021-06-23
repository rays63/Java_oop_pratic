import java.util.Scanner;

public class NumberAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int number = input.nextInt();
        int ones = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + ones;
        System.out.println("The sum of the digits is " + sum);
    }
}