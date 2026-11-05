import java.util.Scanner;
public class RestOrders {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number to get your meal please :)");
       int choice = input.nextInt();
       switch (choice) {
        case 1:
            System.out.println("Pizza");
            
            break;
       
        case 2:
            System.out.println("Burger");
            
            break;
       
        case 3:
            System.out.println("pasta");
            
            break;
       
        case 4:
            System.out.println("Salad");
            
            break;
       
        default: 
        System.out.println("We do not have meal for you sorry:(");
            break;
       }


       

    }
}
