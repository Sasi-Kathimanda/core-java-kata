package programming;

public class FloorFinder {

    public int findFloor(String input) {
        int counter = 0;
         char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                counter++;
            } else {
                counter--;
            }
        }
        return counter;
    }

    public int firstTimeWhichFloor(int firstTimeFloorNumber, String input) {
        return toString().length();
    }
}
