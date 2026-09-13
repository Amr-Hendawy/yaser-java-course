
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();
//  1 2 3 4 5 6 7 8 9 ما لانهايه   5
        if (var2 > 0) {
            System.out.println("Positive Number");
            if (var2 % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        } else if (var2 < 0) {
            System.out.println("Negative Number");
            if (var2 % 2 == 0) {
            System.out.println("Even Number");
            } else {
            System.out.println("Odd Number");
            }
        } else {
            System.out.print("Zero");
        }

    }
}
