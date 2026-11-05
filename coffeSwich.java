import java.util.Scanner;
public class coffeSwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you the number for your coffee type");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Espresso");
                
                break;

                case 2:
                    System.out.println("Moca");
                break;

        
            default:
                System.out.println("We don not have the type of your coffee");
                break;
        }
        

    }
}
