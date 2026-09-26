
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; // Variable Declaration
        System.out.println("Enter The number to test");
        number = input.nextInt();
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Number +");
                System.out.println("Even Number +");
            } else {
                System.out.println("Positive Number +");
                System.out.println("Odd Number +");
            }

        } else if (number < 0) {
                       if (number % 2 == 0) {
                System.out.println("Negative Number -");
                System.out.println("Even Number -");
            } else {
                System.out.println("Negative Number -");
                System.out.println("Odd Number -");
            }
        } else {
            System.err.println("Zero");
        }
    }
}
