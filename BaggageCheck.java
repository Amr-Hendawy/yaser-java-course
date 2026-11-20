import java.util.Scanner;

public class BaggageCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int PRICE_PER_KG = 10;
        int allowedWeight;

        System.out.print("Enter travel class (F = First, B = Business, C = Economy): ");
        String travelClass = input.next().toUpperCase();

        switch (travelClass) {
            case "F":
                allowedWeight = 40;
                break;
            case "B":
                allowedWeight = 32;
                break;
            case "C":
                allowedWeight = 23;
                break;
            default:
                System.out.println("Invalid travel class. Choose F, B, or C.");
                return;
        }

        System.out.print("Enter bag weight in kilograms: ");

        if (!input.hasNextDouble()) {
            System.out.println("Enter a valid weight, such as 25 or 25.5.");
            return;
        }

        double bagWeight = input.nextDouble();

        if (!Double.isFinite(bagWeight) || bagWeight <= 0) {
            System.out.println("Enter a weight greater than zero.");
            return;
        }

        if (bagWeight <= allowedWeight) {
            System.out.println("Your bag is within the weight limit. Please proceed to your gate.");
        } else {
            double extraWeight = bagWeight - allowedWeight;
            double fee = extraWeight * PRICE_PER_KG;

            System.out.printf("Excess weight: %.2f kg%n", extraWeight);
            System.out.printf("Extra baggage fee: %.2f SAR%n", fee);
        }
    }
}