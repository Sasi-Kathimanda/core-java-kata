package prgramming.challenges.codility;

public class NumberOfZerosDecimalTest {
    public static void main(String[] args) {
      //  System.out.println(countNumberOfZeros(219));
        int count = 0;
        int n = 100;
        for (int i = 0; i <= n; i++) {
            int m= i;
            do {
                if (m % 10 == 0)
                    ++count;

                m = m / 10;
            } while (m > 0);
        }
        System.out.println("count = " + count);

    }

    private static int countNumberOfZeros(int input) {
        return getCount(input);
    }

    private static int getCount(int input) {
        int zeroes = 0;
        for (int i = 0; i <= input; i++) {
          //  if (hasZero(i) >= 1) {
                zeroes += hasZero(i);
        //    }
        }
        return zeroes;
    }

    private static int hasZero(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            if (n % 10 == 0) {
                if (n % 100 == 0) {
                   // System.out.println(n);
                    count++;
                    return count;
                }
                return 1;
            }
            n = n / 10;
        }
        return 0;
    }
}
