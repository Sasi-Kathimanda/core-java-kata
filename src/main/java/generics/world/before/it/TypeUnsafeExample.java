package generics.world.before.it;

public class TypeUnsafeExample {
    public static void main(String[] args) {
        StringCircularBuffer buffer = new StringCircularBuffer(10);

        buffer.offer("ab");
        buffer.offer("c");
        buffer.offer("de");

        String concatenatedString = getConcatenated(buffer);
        System.out.println("concatenatedString = " + concatenatedString);

    }

    private static String getConcatenated(StringCircularBuffer buffer) {
        StringBuilder sb = new StringBuilder();
        String value;
        while ((value = (String)buffer.poll()) != null) {   //Fixme: using circularBuffer need external casting
            sb.append(value);
        }
        return sb.toString();
    }
}
