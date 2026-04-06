package com.amalvadkar.lyk;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class YearTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            2015,false
            2016,true
            2017,false,
            2018,false,
            2019, false
            2020,true,
            1900,false,
            2000,true,
            2200,false,
            3300,false
            """)
    void should_return_false_for_2015_year(int givenYear, boolean expected) {
        Year year = Year.of(givenYear);

        assertThat(year.isLeap()).isEqualTo(expected);
    }
}
