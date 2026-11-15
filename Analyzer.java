import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.println("Enter the num");
        num = input.nextInt();
        if(num>0){
            if(num %2 == 0){
                
                    System.out.println("the num is p");
                    System.out.println("Even");
                
            } else {
                System.out.println("the num is p");
                System.out.println("odd");
            } 
        }else if (num <0){
            if( num%2 == 0){
                System.out.println("the num is n");
                System.out.println("Even");
            } else{
                System.out.println("the num is n");
                System.out.println("Odd");
            }
            } else if (num >= 100 || num <= 0){
                System.out.println("Big num");
            }

        }
    }
