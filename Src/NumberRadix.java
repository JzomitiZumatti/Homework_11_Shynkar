import java.util.Random;

public class NumberRadix {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 11;
        int max = 100011;
        int randNumber = random.nextInt(max - min + 1) + min;
        String num = String.valueOf(randNumber);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.printf("The radix sum of %d number is: %d", randNumber, sum);
    }
}
