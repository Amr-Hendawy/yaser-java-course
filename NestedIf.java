import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the num");
        num = input.nextInt();
        if(num > 0){
            if(num %2 == 0){
                System.out.println("the num is postive");
                System.out.println("Even");
            } else{
                System.out.println("the num is postive");
                System.out.println("odd");

            }
            
        }
        else if(num < 0){
            if(num %2 == 0){
                System.out.println("the num is negetive");
                System.out.println("Even");
                
            } else{
                System.out.println("the num is negetive");
                System.out.println("odd");

            }
            
        }
        else{
            System.out.println("Zero");
        }


    }
}
