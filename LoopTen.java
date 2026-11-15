
public class LoopTen {
    public static void main(String[] args) {
       for(int i = 0; i <= 10; i++){
        if(i == 4){
        // continue; // skip num 4
            break; // stop before 4
        }
        System.out.println(i);
       }
    }
}
