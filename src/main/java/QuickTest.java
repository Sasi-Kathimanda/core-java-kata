public class QuickTest {
    private static final Object[] buffer = new Object[2];

    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++ ) {
            System.out.println(i+"->" + next(i));
        }
    }

    public static int next(int index) {
        System.out.println("index = " + index);
        return (index + 1) % buffer.length;
    }


}
