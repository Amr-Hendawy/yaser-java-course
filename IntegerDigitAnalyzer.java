import java.util.Scanner;
public class IntegerDigitAnalyzer {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a postive int number");
    int number = input.nextInt();
    int count = 0;
    int sum = 0;
    while (number>0) {
        int digit = number %10; // to delete the last number
        count++ ; // calculating the numbers of the digits 
        sum += digit; // adding the digit togother  (sum = sum + digit)?
        number = number /10; //
    } 
    System.out.println("Total digit" + count);
    System.out.println("sum of digit" + sum);
    input.close();

    
} 
    
}
// 5832
// 5 + 8 + 3 + 2 = 18
// 4
// 18