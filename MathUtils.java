public class MathUtils {
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
