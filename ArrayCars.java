//java ==>root package
// util ==>subpackage
// Scanner ==> class name
// java.util.Scanner ==> FQCN (fully qualified class name)
// public class ArrayCars {
// public static void main(String[] args) {
//  String[] cars = {"BMW","MRC","Touta"};
//  for(int i =0; i<cars.length; i++){
//     System.out.println(cars[i]);
//  }

// }
// }
public class ArrayCars {

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5 };
        int sum = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            sum = sum + numbers[i];

            System.out.println(numbers[i]);
        }
        System.out.println(sum);
    }
}