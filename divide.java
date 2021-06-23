import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number:");
        double num1 = input.nextInt();

        if(num1 % 5 == 0 && num1 % 6 == 0){
            System.out.println(num1 + " is divisible by both 5 or 6");
        }

        else if(num1 % 5 == 0){
            System.out.println(num1 + " is divisible by 5 or 6");
        }

        else{
            System.out.println(num1 + " is not divisible by either 5 or 6");
        }

    }
}
