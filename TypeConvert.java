public class TypeConvert {
    public static void main(String[] args) {
        int num = 20;
        double wideNum = num;

        double price = 19.99;
        int narrowPrice = (int)price;
        
        System.out.println("Orginal int"+num);
        System.out.println("wideing"+wideNum);

        System.out.println("Original double"+ price);
        System.out.println("Narrow"+narrowPrice);
}
}
