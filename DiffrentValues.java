import java.util.Scanner;
public class DiffrentValues{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number");
        int num = input.nextInt();
        if ( num >0){
            System.out.println("P");

        }else if(num<0){
            System.out.println("N");
        }else {
            System.out.println("Z");

        }
        input.close();
        
        }
    } 

    

    
