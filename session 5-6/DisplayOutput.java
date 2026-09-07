    import java.util.Scanner;

    public class DisplayOutput {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int marks;
            System.out.print("Enter Your Marks");
            marks = input.nextInt();


            if (marks == 50) {
                System.out.println("Congratulations, you passed");
                System.out.println("Com here to get your prize");
            }

        }
    }
