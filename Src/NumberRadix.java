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
        System.out.printf("\nThe radix sum of %d number is: %d", randNumber, radixSum(randNumber));
    }

    public static int radixSum(int randNumber) {
        int radixSum = 0;
        int lengthOfNumber = String.valueOf(randNumber).length();
        for (int i = lengthOfNumber - 1; i >= 0; i--) {
            double divider = Math.pow(10, i);
            radixSum += randNumber / (int) divider;
            randNumber %= divider;
        }
        return radixSum;
    }
}
