package programming.challenges.codility;

public class NumberOfZerosDecimalTest {
    public static void main(String[] args) {
        System.out.println(countNumberOfZeros("100"));
    }

    private static int countNumberOfZeros(String input) {
        return getCount(Integer.parseInt(input));
    }

    private static int getCount(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int n1 = i;
            do {
                if (n1 % 10 == 0) {
                    count++;
                }
                n1 = n1 / 10;
            } while (n1 != 0);
        }
        return count;
    }
}
