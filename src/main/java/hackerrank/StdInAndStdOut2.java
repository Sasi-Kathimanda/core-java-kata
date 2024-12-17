package hackerrank;

import java.util.Scanner;

public class StdInAndStdOut2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfInputs = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (numberOfInputs % 2 != 0) {
            System.out.println("Weird");
        } else if (numberOfInputs % 2 == 0) {
            if (numberOfInputs >= 2 && numberOfInputs <= 5) {
                System.out.println("Not Weird");
            } else if (numberOfInputs >= 6 && numberOfInputs <= 20) {
                System.out.println("Weird");
            } else if (numberOfInputs > 20) {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
