
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double num1 = input.nextDouble();

        System.out.println("Enter Second Number:");
        double num2 = input.nextDouble();

        System.out.println("Enter Operation (+, -, *, /): ");
        char operation = input.next().charAt(0);
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
