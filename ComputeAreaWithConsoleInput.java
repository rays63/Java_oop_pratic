import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //importing scanner class
        Scanner input = new Scanner(System.in);

        //asks the user radius
        System.out.printf("Enter the radius oof circle =");
        Double radius = input.nextDouble();

       if (0 >= radius){
           System.out.printf("Input valid radius.");
        }
       else {
           double area = 3.141 * radius * radius;
           System.out.printf("The area of circle with radius "+ radius + " is "+ area);
       }
    }
}
