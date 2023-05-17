package codebat.string1;

public class FirstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
        System.out.println(firstTwo("a"));
        System.out.println(firstTwo(""));
    }

    public static String firstTwo(String str) {
        if (str.isEmpty() || str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }

    }

}
