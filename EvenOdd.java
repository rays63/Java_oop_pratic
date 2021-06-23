import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int num1;
        System.out.println("Enter a number:");

        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        if ( num1 % 2 == 0 ) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
