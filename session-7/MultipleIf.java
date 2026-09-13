
import java.util.Scanner;

public class MultipleIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter Two Numbers");

        number1 = input.nextInt();
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println("Equals");
        } else if (number1 > number2) {
            System.out.println("Number1 is Greater than Number2");
        } else {
            System.out.println("Number2 is Greater than Number1");
        }
    }
}
