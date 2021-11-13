package generics.world.after.it;

public class TypeSafeExample {
    public static void main(String[] args) {
        CircularBuffer<String> stringCBuffer = new CircularBuffer<>(10);
        stringCBuffer.offer("ab");
        //stringCBuffer.offer(1);
    }
}