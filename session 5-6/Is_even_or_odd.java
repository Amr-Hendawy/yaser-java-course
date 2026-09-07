import java.util.Scanner;
public class Is_even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter the number");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print("Even");
        }
        if (num % 2 == 1) {
            System.out.print("Odd");
        }
        input.close();
    }
}
