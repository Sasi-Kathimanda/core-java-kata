package com.juni5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringJoinerTest {
    @Test
    @DisplayName("stringJoiner_When_Mandatory_Delimiter_Supplied")
    void stringJoinerWhenMandatoryDelimiterSupplied() {
        StringJoiner sj = new StringJoiner("-");
        sj.add("sasi");
        sj.add("kiran");
        sj.add("raja");
        assertEquals("sasi-kiran-raja", sj.toString());
        assertEquals("sasi-kiran-raja", String.format("%s-%s-%s", "sasi", "kiran", "raja"));
    }

    @Test
    @DisplayName("joiner_when_using_a_List")
    void joinerWhenUsingAList() {
        StringJoiner sj = new StringJoiner("-");
        List<String> list = List.of("Sasi", "Kiran", "Raja");
        for (String s : list) {
            sj.add(s);
        }
        assertEquals("Sasi-Kiran-Raja", sj.toString());
    }

    @Test
    @DisplayName("joiner_when_the_feeder_isEmpty")
    void joinerWhenTheFeederIsEmpty() {
        StringJoiner joiner = new StringJoiner("-");
        assertEquals(0, joiner.toString().length());
    }

    @Test
    @DisplayName("joiner_when_the_feeder_isEmpty_And_There_Is_Default")
    void joinerWhenTheFeederIsEmpty_And_There_Is_Default() {
        StringJoiner joiner = new StringJoiner("-");
        joiner.setEmptyValue("DEFAULT");
        assertEquals("DEFAULT", joiner.toString());
    }

    @Test
    @DisplayName("joiner_when_there_is_Prefix_Suffix_Applied")
    void joinerWhenThereIsPrefixSuffixApplied() {
        StringJoiner joiner = new StringJoiner("-", "{", "}");
        joiner.add("Sasi");joiner.add("Kathimanda");
        assertEquals("{Sasi-Kathimanda}",joiner.toString());
    }


    @Test
    @DisplayName("joiner_when_there_is_Prefix_Suffix_And_No_Feeder")
    void joinerWhenThereIsPrefixSuffixAndNoFeeder() {
        StringJoiner joiner = new StringJoiner("-", "{", "}");
        assertEquals("{}",joiner.toString());
    }

    @Test
    @DisplayName("joiner_when_there_is_Prefix_Suffix_And_No_Feeder_And_Have_Default")
    void joinerWhenThereIsPrefixSuffixAndNoFeederAndHaveDefaultSet() {
        StringJoiner joiner = new StringJoiner("-", "{", "}");
        joiner.setEmptyValue("default");
        assertEquals("default",joiner.toString());
    }
}
