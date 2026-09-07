import java.util.Scanner;

public class DisplayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Integer");
        int num1 = input.nextInt();
        System.out.print("Enter The Second Integer");
        int num2 = input.nextInt();
        int total = num1 + num2;
        // System.out.print("Total Number is: " + total);
        // placeholder 
        // d = digit
        System.out.printf("Total Number is: %d", total);
    }
}
// Single Line Comment
/*
Multiple Lines Comment
Multiple Lines Comment
Multiple Lines Comment
Multiple Lines Comment
*/