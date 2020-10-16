package prgramming.challenges;

import java.util.stream.IntStream;

public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindromeUsingLambda("sasi"));
    }

    private static boolean isPalindrome(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        return input.equals(sb.toString());
    }

    private static boolean isPalindromeUsingLambda(String input) {
        return IntStream.range(0, input.length() / 2)
                .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));
    }
}
