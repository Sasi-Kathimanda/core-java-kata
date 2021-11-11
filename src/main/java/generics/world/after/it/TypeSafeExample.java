package generics.world.after.it;

public class TypeSafeExample {

    public static void main(String[] args) {
        GenericCircularBuffer<String> stringCBuffer = new GenericCircularBuffer<>(10);
        stringCBuffer.offer("ab");
        //stringCBuffer.offer(1);

    }
}
