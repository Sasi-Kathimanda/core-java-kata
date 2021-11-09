package generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    CircularBuffer buffer = new CircularBuffer(2);

    @Test
    void shouldOfferPollableElement() {
        assertTrue(buffer.offer(1));
        assertEquals(1,buffer.poll());
        assertNull(buffer.poll());
    }

    @Test
    void shouldNotOfferWhenBufferIsFull() {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertFalse(buffer.offer(3));
    }

    @Test
    void  shouldNotPollWhenBufferIsEmpty() {
        assertNull(buffer.poll());
    }

    @Test
    void shouldRecycleBuffer() {
    buffer.offer(1);
    buffer.offer(2);
    buffer.poll();
    buffer.offer(3);
    buffer.poll();
    buffer.poll();

    }

}