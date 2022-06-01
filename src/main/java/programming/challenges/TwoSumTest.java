package programming.challenges;


import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {
    public static void main(String[] args) {
        int[] intArray = new int [] {2,3,7,4,9};
        printTwoSumViaBruteForce(intArray,10);
        printTwoSumViaOnePass(intArray, 10);
    }

    private static void printTwoSumViaBruteForce(int[] intArray, int target) {
        for(int i = 0 ; i< intArray.length; i++) {
            for (int j = 0; j < intArray.length;j++) {
                if(intArray[i]+intArray[j] == target) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    private static void  printTwoSumViaOnePass(int[] input, int target) {
        Map<Integer,Integer> recorder = new HashMap<>();

        //add elements to recorder
        for (int i = 0 ; i < input.length; i++) {
            recorder.put(input[i],i);
            int delta = target - input[i];
            if(recorder.containsKey(delta)) {
                System.out.println(i+"-" + recorder.get(delta));
            }
        }
        }

}
