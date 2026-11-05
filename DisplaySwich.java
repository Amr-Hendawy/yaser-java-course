import java.util.Scanner;
public class DisplaySwich {
    public static void main(String[] args) {
        char grade;
        String massege;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the grade");
        grade= read.next().charAt(0);
        switch (grade) {
            case 'a':
                System.out.println("Excllent"); 
                break;
            case 'b':
                System.out.println("Very good"); 
                break;
            case 'c':
                System.out.println("good"); 
                break;
            case 'd':
                System.out.println("poor"); 
                break;
            case 'f':
                System.out.println("Failed"); 
                break;
        
            default:
                System.out.println("The grade is invalied");
        }


        
    }
}
