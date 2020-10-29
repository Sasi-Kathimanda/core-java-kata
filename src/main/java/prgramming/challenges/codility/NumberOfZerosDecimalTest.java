package prgramming.challenges.codility;

public class NumberOfZerosDecimalTest {
    public static void main(String[] args) {
        System.out.println(countNumberOfZeros(100));
    }

    private static int countNumberOfZeros(int input) {
        return getCount(input);
    }

    private static int getCount(int input) {
        int zeroes = 0;
        for (int i = 0; i <= input; i++) {
            if (hasZero(i) == 1) {
                zeroes++;
            }
        }
        return zeroes;
    }

    private static int hasZero(int n) {
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            if (n % 10 == 0) {
                return 1;
            }
            n = n / 10;
        }
        return 0;
    }
}
