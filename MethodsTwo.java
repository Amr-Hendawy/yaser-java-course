public class MethodsTwo {

    static int doubleGame(int x) { // the methode
        return x * 2; // taking the value in place 
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) { // loop
            System.out.println("double of " + i + " is " + doubleGame(i));
        }

    }

}