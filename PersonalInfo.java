import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = input.nextLine();

    System.out.println("Enter your family name");
    String family = input.nextLine();

    System.out.println("Enter your age");
    int age = input.nextInt();

    System.out.println("Enter youe grade");
    int grade = input.nextInt();

    System.out.println("name:" + name);
    System.out.println("Family name:" + family);
    System.out.println("age:" + age);
    System.out.println("grade:" + grade);

    input.close();
    



    


        
    }
}
