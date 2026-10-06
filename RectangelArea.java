import java.util.Scanner;
public class RectangelArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        int area;
        System.out.println("Enter rectangel legnth");
        length = input.nextInt();
        System.out.println("Enter rectangel width");
        width = input.nextInt();
        area = length * width;
        System.out.printf("rectangle are is %d",area);
        
    }

    }