package programming.challenges;

import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String[] args) {
        String[] names = new String[]{"Sasi", "Aruna", "Aashi", "Aaru"};
        int arrayLength = names.length;
        System.out.println(Arrays.toString(reverseArray(arrayLength, names)));
        System.out.println(Arrays.toString(reverseArrayWithoutUsingNewArray(arrayLength, names)));
    }

    private static String[] reverseArray(int arrayLength, String[] names) {
        String[] temp = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int j = arrayLength - 1 - i;
            temp[j] = names[i];
        }
        return temp;
    }

    private static String[] reverseArrayWithoutUsingNewArray(int arrayLength, String[] names) {
        String t;
        for (int i = 0; i < arrayLength / 2; i++) {
            System.out.println("i = " + i);
            t = names[i];
            names[i] = names[arrayLength - 1 - i];
            names[arrayLength - 1 - i] = t;
        }
        return names;
    }
}
