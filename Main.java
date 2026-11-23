
public class Main {
//  Methods can run only when call it
// it can pass data called parameters/ variable
// methods/functions/routine/subroutine are used to perform/do certain actions and they are also known as functions  
// Why we use methods ??! to reuse code (define once - and use it many times)
// To perform DRY ==> Don't repeat yourself

//create a method called myMethod inside Main
// ====== myMethod() ==> name of the method
// ====== static ==>means that the method belongs to Main Class 
// ====== void ==> means that this method doesn'y have a return value
    // static void myMethod() {
    //     // code to be excuted
    //     System.out.println("Hello");
    // }
    // static void welcomeMessage(String myName) {
    //     System.out.printf("Hello %s%n", myName);
    //     System.out.printf("Hello " + myName);
    // }
    // String myName = "Amr";
    static void myMethod(String firstName, String secondName, int age) {
        System.out.println("my name is "  + firstName + " " + secondName + " and my age is " + age);
    }

    public static void main(String[] args) {
        // welcomeMessage("Yaser");
        // welcomeMessage("Amr");
        // welcomeMessage("osama");
        // welcomeMessage("5");
        myMethod("yaser", "Ali", 30);
        myMethod("Osama", "Elsayd", 15);
        myMethod("Ali", "Elshamy", 10);

    }
}
