import java.util.Scanner;
public class CompoundInterst {
    
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double principal;
    double rate;
    int timesCompounds;
    int years;
    double amount;
    System.out.println("Enter the amount");
    principal = input.nextDouble();
   System.out.println("Enter the interest rate in %");
   rate = input.nextDouble() / 100;
   System.out.println("Enter the # times compounded per year"); 
   timesCompounds = input.nextInt();
   System.out.println("Enter the # of years");
   years = input.nextInt();
   amount = principal * Math.pow(1 + rate / timesCompounds , timesCompounds * years);
   System.out.println("The amount after the " +years + amount);

}