package com.junit5.demo.stream.collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

class CollectorsMethodsTests {
    @Test
    @DisplayName("JoinStrings")
    void joinStrings() {
        //given
        List<String> list = List.of("Sasi", "Kiran", "Raja");
        String result = list.stream()
                            .collect(Collectors.joining(" ", "<<", ">>"));
        Assertions.assertEquals("<<Sasi Kiran Raja>>", result);
    }
}
