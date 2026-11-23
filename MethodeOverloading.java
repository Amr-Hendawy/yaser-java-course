

public class MethodeOverloading {
    static int plusMethod(int x ,int y){
        return x + y ;

    }
    static double plusMethod(double x , double y){
        return x + y ;
    }
    public static void main(String[] args) {
        int num1 = plusMethod(5, 6);
        double num2 = plusMethod(5.0, 9.7);
        System.out.println(num1);
        System.out.println(num2);
        
    }
}
