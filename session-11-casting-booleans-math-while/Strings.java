
public class Strings {

    public static void main(String[] args) {
        String greeting = "hello yaser";
        String txt = "ABCDEFGHIJKLMNOPQSTRUVWXYZ";
        
        System.out.println("The Length of the text is : ==> " + txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.indexOf("hello"));
        System.out.println(greeting.indexOf("yaser"));
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.charAt(1));
        System.out.println(greeting.charAt(2));
        System.out.println(greeting.charAt(4));
        
    }
}
