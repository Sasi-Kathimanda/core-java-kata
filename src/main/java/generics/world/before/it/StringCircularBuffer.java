package generics.world.before.it;

public class StringCircularBuffer {
    private final String[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public StringCircularBuffer(int size) {
        buffer = new String[size];
    }

    public boolean offer(String value) {
        if (buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public String poll() {
        var value = buffer[readCursor];
        if (buffer[readCursor] != null) {
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    private int next(int index) {
        return (index + 1) % buffer.length;
    }
}
