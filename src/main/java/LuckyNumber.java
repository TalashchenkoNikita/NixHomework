import java.util.Random;
public class LuckyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int luckyNumber = random.nextInt(9);
        System.out.println(luckyNumber);
    }
}
