package prgramming.challenges;

public class ReverseNumberTest {
    public static void main(String[] args) {
        reverseNumber(1002);
    }

    private static void reverseNumber(int input) {
        int rev = 0;
        while (input != 0) {
            rev = rev * 10 + input % 10;
            input = input / 10;
        }
        System.out.println(rev);
    }

}
