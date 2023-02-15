import java.util.Arrays;
//  num is [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

public class squareNumSum {
    public static int squareSum(int[] num) {
        return Arrays.stream(num).map(n -> n * n).sum();
    }
}