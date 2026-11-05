import java.util.Scanner;
public class School {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int grade;
    System.out.println("Enter you grade");
    grade = input.nextInt();
    if(grade > 100 || grade < 0){
        System.err.println("Errore");
        
    } else if(grade >= 85){
        System.out.println("Excellent");
    } else if(grade >= 50){
        System.out.println("Good");
    } else {
        if(grade >= 30){
             System.out.println("needs help");
             
        } else {
             System.out.println("Poor");
        }
    }

    }

    }
    