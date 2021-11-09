package generics;

public class CircularBuffer {
    private Object[] queue;
    private int readCursor;
    private int writeCursor;

    public CircularBuffer(int size) {
        queue = new Object[size];
    }

    public boolean offer(Object element) {

        return true;
    }

    public Object poll() {
        return  null;
    }

}
