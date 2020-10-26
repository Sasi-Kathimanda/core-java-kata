package prgramming.challenges;

import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String[] args) {
        String[] names = new String[]{"Sasi", "Aruna", "Aashi", "Aarush"};
        int arrayLength = names.length;
        System.out.println(Arrays.toString(reverseArray(arrayLength, names)));
    }

    private static String[] reverseArray(int arrayLength, String[] names) {
        String[] temp = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int j = arrayLength - 1 - i;
            temp[j] = names[i];
        }
        return temp;
    }
}
