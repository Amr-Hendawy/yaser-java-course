import java.util.Scanner;

public class DisplayOutput {
    public static void main(String[] args) {
        // Declaration Section
        Scanner read = new Scanner(System.in);
        char grade;
        String message;
        // input grade
        System.out.println("Enter the grade");
        grade = read.next().charAt(0);
        switch (grade) {
            case 'a':
                message = "Excellent!";
                break;
            case 'b':
                message = "Very Good!";
                break;
            case 'c':
                message = "Good!";
                break;
            case 'd':
                message = "Fair!";
                break;
            case 'f':
                message = "Failed!";
                break;
            default:
                message = "The Grade is Invalid";
                break;
        }
        System.out.print(message);
    }
}
