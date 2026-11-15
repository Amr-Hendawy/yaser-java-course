import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        boolean eligible = age >= 18;
        if(eligible){
            System.out.println("You can vote");
        }else{
            System.out.println("Your can not vot");
            
        } input.close();

        
    }
}
