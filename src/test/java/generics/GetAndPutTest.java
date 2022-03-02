package generics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GetAndPutTest {

    @Test
    void getTheValueOutOfStructure() {
        GetAndPut sut = new GetAndPut();
        double actual = sut.sum(List.of(1, 2, 3, 4, 5));
        assertEquals(15.0, actual);
    }

}