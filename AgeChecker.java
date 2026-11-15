import java.util.Scanner;
public class AgeChecker {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int age;
System.out.println("Enter your age");
age = input.nextInt();
if(age <0){
    System.out.println("Error");
}
else if (age <= 12){
    System.out.println("Childe");
}
else if(age <= 17){
    System.out.println("Teenager");
} else {
    System.out.println("Adult");
}
  if  (age >= 60){
    System.out.println("Senior");
} 
}
    }

