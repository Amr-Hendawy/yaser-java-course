import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Calculate rectangle area
        int length;
        int width;
        int area;
        
        System.out.println("Enter Rectangle Length");
        length = input.nextInt();
        
        System.out.println("Enter Rectangle Width");
        width = input.nextInt();

        area = length * width;
        System.out.printf("The Rectangle area is ==> %d", area);

    }
}
/*
char character or small intger 1byte  "a" 5
int integer 4bytes   5 6 10 
short int (short) short integer 2byte 100 500
long int (long) long integer 4byte 1000 10000000
bool boolean true false 1byte true false
float floating point number 4bytes   5.3 6.2 1.0 9.0
double double precision 8bytes 1512369857451236
long double 8byte 
*/
// Datatype + size
