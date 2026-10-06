import java.util.Scanner;
public class TwoNums{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1, num2 ;
        System.out.print("Enter the two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 > num2){
            System.out.print("num1 bigger than num2");
            
        }
         else if(num2 > num1){
            System.out.print("num2 bugger than num1");
        
        }
        else{
        System.out.print("equale");
        }
            
        

        
    }
}
