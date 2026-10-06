
// public class WhileAndIf {

//     public static void main(String[] args) {
//         int number = 1;
//         while (number <= 6) {
            
//         if (number < 6) {
//             System.out.println("Lose");
//         } else {
//             System.out.println("Win");

//         }
//         number++;
//     }

//     }
// }
public class FunctionsInJava {

    public  static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
           
        System.out.println(addNumbers(5,7));
        System.out.println(addNumbers(8,3));
        System.out.println(addNumbers(10,50));

    }
}
