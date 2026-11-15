import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();
        
        System.out.println("Enter the seconde number");
        double num2 = input.nextDouble();

        System.out.println( "Addtion" +(num1 + num2)  );
        System.out.println( "Substract" +(num1 - num2)  );
        System.out.println( "Devision" +(num1 / num2)  );
        System.out.println( "Multibly" +(num1 * num2)  );
        if(num1 == 0){
            System.out.println("Can not devide by zero");
            
        }
        input.close();
        
        
    }
}
