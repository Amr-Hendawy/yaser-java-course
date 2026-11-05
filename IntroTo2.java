import java.lang.reflect.Array;
import java.util.Arrays;

public class IntroTo2 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        boolean[] prices = new boolean[3];
        double[] status = new double[5];
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(status));
        String[] names = new String[6];
        System.out.println(Arrays.toString(names));
        int[] myNums = {6,7,8};
        System.out.println(myNums.length);
    }
}
