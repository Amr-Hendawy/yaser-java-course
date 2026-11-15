// public class MethodeOveloading {
//     static int plusMethodeint(int x , int y){
//         return x+y;
//     }
//     static double plusMethodedouble(double x , double y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         int myNum1=plusMethodeint(5, 10);
//         double myNum2 = plusMethodedouble(4, 4);
//         System.out.println(myNum1);
//         System.out.println(myNum2);
//     }

// }
// overloading
public class MethodeOveloading {
    static int plusMethode(int x , int y){
        return x+y;
    }
    static double plusMethode(double x , double y){
        return x+y;
    }
    public static void main(String[] args) {
        int myNum1=plusMethode(5, 10);
        double myNum2 = plusMethode(6.6, 6.4);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }

}
