import java.util.Scanner;
public class AgeCheckUsingIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age to check if ypu allow or not");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You can Enter the gate ");

        } else{
            System.out.println("You are not allowwed to Enter the gate sorry:(");
        }
    }

}
