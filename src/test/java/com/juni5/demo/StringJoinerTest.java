package com.juni5.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

class StringJoinerTest  {
    @Test
    @DisplayName("stringJoiner_When_Mandatory_Delimiter_Supplied")
    void stringJoinerWhenMandatoryDelimiterSupplied() {
        StringJoiner sj = new StringJoiner("-");
        sj.add("sasi");
        sj.add("kiran");
        sj.add("raja");
        Assertions.assertEquals("sasi-kiran-raja",sj.toString());
        Assertions.assertEquals("sasi-kiran-raja",String.format("%s-%s-%s","sasi","kiran","raja"));
    }
}
