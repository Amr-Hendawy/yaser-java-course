public class ShapesLoop {
    public static void tringel() {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void circle() {
        int radius = 15;
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius * 2; x <= radius * 2; x++) {
                double distance = (x * x) / 4.0 + (y * y);
                if (Math.abs(distance - radius * radius) <= radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void diemond() {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = rows-1; i>=1; i--){
            for(int j =1; j<=rows-i;j++){
                System.out.print(" ");
            } 
            for(int k =1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
       // tringel();
       // circle();
        diemond();

    }

}
