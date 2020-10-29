package prgramming.challenges.codility;

public class NumberOfTrailingZerosFactorialTest {
    public static void main(String[] args) {
        int n = 219;
        countNumberOfTrailingZeros(n);
    }

    private static void countNumberOfTrailingZeros(int n) {
        long zeros = 0;
        while (n != 0) {
            zeros += n / 5;
            n /= 5;
        }
        System.out.printf("Number of trailing zeros of the factorial %d is %d ", n, zeros);
        System.out.printf("\n");
    }
}
