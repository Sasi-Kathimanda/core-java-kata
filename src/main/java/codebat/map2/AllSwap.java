package codebat.map2;

public class AllSwap {
    public static void main(String[] args) {
        String[] list1 = new String[]{"ab", "ac"};
        String[] list2 = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] list3 = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        System.out.println(allSwap(list1));

    }

    public static String[] allSwap(String[] strings) {
//        Arrays.stream(strings).collect(Collectors.toMap(k->k.substring(0,1),v-> strings.))
        return new String[] {};
    }

}
