// public class Homework {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 5, 40, 25};
//         int sum = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             sum = sum + numbers[i];
//         }

//         int average =  sum / numbers.length;

//         System.out.println("Sum: " + sum);
//         System.out.println("Average: " + average);
//     }
// }
public class Homework {
public static void main(String[] args) {
int[] myNumbers = {10,20,5,40,25};
int sum = 0;
for(int i = 0; i < myNumbers.length; i++){
    sum = sum + myNumbers[i];

}
int average = sum / myNumbers.length;
System.out.println("Sum" + sum); 
System.out.println("Average" + average);
}
}