package codebat.string1;

public class MakeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
    }

    public static String makeTags(String tag, String word) {
        final String preTag = "<" + tag + ">";
        final String postTag = "</" + tag + ">";
        return preTag + word + postTag;
    }

}
