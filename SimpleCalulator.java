import java.util.Scanner;
public class SimpleCalulator {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the first number ");
    double number1 = input.nextDouble();
    
    System.out.println("Enter the seconde number");
    double number2 = input.nextDouble();

    System.out.println("Enter the opreation(+ , - , * , /)");
    char opreation = input.next().charAt(0);
    double result; 
    switch (opreation) {
        case '+':
        result = number1 + number2;
            System.out.println("the Result is  " +result);
            break;
        case '-':
        result = number1 - number2;
            System.out.println("the Result is  " +result);
            break;
        case '*':
        result = number1 *number2;
            System.out.println("the Result is  " +result);
            break;
        case '/':
        result = number1 / number2;
            System.out.println("the Result is " +result);
            break;
    
        default:
            System.out.println("The value is invalied");
            break;
    }
    
   


 }   
}
