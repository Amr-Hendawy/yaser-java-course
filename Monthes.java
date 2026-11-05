import java.util.Scanner;
public class Monthes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.println("Enter the first number of your month");
       int monthes = input.nextInt();
        switch (monthes) {
            case 1:
                 System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                
                break;
            case 3:
                 System.out.println("mar");
                break;
            case 4:
                 System.out.println("apr");
                break;
            case 5:
                 System.out.println("may");
                break;
            case 6:
                 System.out.println("jun");
                break;
            case 7:
                 System.out.println("jul");
                break;
            case 8:
                 System.out.println("agu");
                break;
            case 9:
                 System.out.println("sep");
                break;
            case 10:
                 System.out.println("oct");
                break;
            case 11:
                 System.out.println("nov");
                break;
            case 12:
                
            default:
                System.out.println("try again ");
                break;
        }
        
    }
}
