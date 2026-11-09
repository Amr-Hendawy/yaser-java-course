import java.util.Random;
import java.util.Scanner;

public class fgfgf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("guss the number from 0 to 100");
        int guss = 0;
        int randomNumber = random.nextInt(101);
        boolean stillplaying = true; //
        System.out.printf("secret number Generated! %d | your guess %d%n", randomNumber,guss);
        while (stillplaying) {
            System.out.println("Enter your guss");
            guss = reader.nextInt();//
            if (guss < 0 || guss > 100) {
                System.out.println("invalid number! Enter between 0 and 100");
            } else if (guss > randomNumber) {
                System.out.println("Too high");
            } else if (guss < randomNumber) {
                System.out.println(" too low");

            } else {
                System.out.println("You win");
                stillplaying = false;
            }

        }
        reader.close();
    }
}