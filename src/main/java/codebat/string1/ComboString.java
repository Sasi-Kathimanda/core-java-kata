package codebat.string1;

public class ComboString {
    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }

    public static String comboString(String a, String b) {
        String shrty;
        String longy;
        if (a.length() > b.length()) {
            longy = a;
            shrty = b;
        } else {
            longy = b;
            shrty = a;
        }
        return shrty + longy + shrty;
    }

}
