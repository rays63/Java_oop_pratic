import java.util.Scanner;

public class exampleBoolene {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = input.nextInt();

        System.out.println("Enter second number");
        num2 = input.nextInt();

        boolean b = (num1 == num2);
        System.out.printf("Number 1 and Number 2 is equal?" + b);
    }
}
