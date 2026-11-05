import java.util.Scanner;
public class Traffic {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
   
   
    System.out.println("Enter the letter");
    char light = Character.toUpperCase(input.next().charAt(0));
   
    switch (light) {
        case 'R':
            System.out.println("Stop");
            
            break;
    
        case 'G':
            System.out.println("Go");
            
            break;
    
        case 'Y':
            System.out.println("Wait");
            
            break;
    
        default:
            System.out.println("Call the police");
            break;
    }
    
   
}
}
