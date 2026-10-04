
// Type Casting Or Type Conversion عملية تغيير نوع البيانات من نوع لآخر
// int ==> double  OR    double => Float
// Widening توسيع الداتا 
// Narrowing تضييق الداتا
// من الصغير لأكبر عمليه أتوماتيكيه
// byte -> short -> char -> int -> long -> float -> double (automatic)

// double -> float -> long -> int -> char -> short -> byte (Manual)

public class TypeCasting {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        double myNewDouble = 9.75d;
        int myNewInt = (int) myNewDouble;

        System.out.println(myNewDouble);
        System.out.println(myNewInt);
        // char text = input.next().charAt(0);
        // System.out.println(text);
    }
}
