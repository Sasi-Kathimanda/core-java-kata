package programming.challenges.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGapTest {
    public static void main(String[] args) {
        System.out.println(findBinaryGaps(20));
    }

    private static int findBinaryGaps(int input) {
        System.out.println(Integer.toBinaryString(input));
        List<Integer> indices = new ArrayList<>();
        char[] chars = Integer.toBinaryString(input).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                indices.add(i);
            }
        }
        List<Integer> differences = new ArrayList<>();
        for (int i = 1; i < indices.size(); i++) {
            differences.add(indices.get(i) - (indices.get(i - 1)) - 1);
        }

        return indices.size() != 1 ? Collections.max(differences) : 0;
    }
}
