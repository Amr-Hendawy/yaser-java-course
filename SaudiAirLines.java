import java.util.Scanner;

public class SaudiAirLines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter the passenger's class ");
        char passClass = input.next().charAt(0);
        System.out.println("please Enter the bag weight");
        double bagWeight = input.nextDouble();
        double exsseucseWight = input.nextDouble();
        double charge = input.nextDouble();
        switch (passClass) {
            case 'f':
                if (bagWeight > 30) {

                    exsseucseWight = bagWeight - 30;
                    charge = exsseucseWight * 10;
                }

                break;
                case 'b':
                if (bagWeight > 25) {

                    exsseucseWight = bagWeight - 25;
                    charge = exsseucseWight * 10;
                }
                break;
                case 'c':
                if (bagWeight > 20) {

                    exsseucseWight = bagWeight - 20;
                    charge = exsseucseWight * 10;
                }
                
                
                
                default:
                    System.out.println("invalide value");
                }
                System.out.println("You have to pay extra charge" + charge);

    }
}
