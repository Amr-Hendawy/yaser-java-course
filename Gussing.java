import java.util.Scanner;
import java.util.Random;
public class Gussing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guss the number from 1 to 10");
        int randomNumber = random.nextInt(10) + 1;
        int guss = 0;
        while (guss!= randomNumber) {
            guss = input.nextInt();
            if( guss > randomNumber){
                System.out.println("Too high");
            
            }else if (guss < randomNumber){
                System.out.println("Too low");

            } else {
                System.out.println("Yow win");
            }

            
            
        }
        input.close();
    }
}
