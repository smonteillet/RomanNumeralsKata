package fr.smo.romannumerals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class RomanToArabicConverterTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"I", 1},
                {"II", 2},
                {"III", 3},
                {"IV", 4},
                {"V", 5},
                {"VI", 6},
                {"VII", 7},
                {"VIII", 8},
                {"IX", 9},
                {"X", 10},
                {"XI", 11},
                {"XIV", 14},
                {"XIX", 19},
                {"XX", 20},
                {"XXXIII", 33},
                {"XL", 40},
                {"LX", 60},
                {"LXXVIII", 78},
                {"LXXXIV", 84},
                {"XCIX", 99},
                {"CCCLXIX ", 369},
                {"CD", 400},
                {"CDXLVIII ", 448},
                {"DCCCLXXXVIII", 888},
                {"M", 1000},
                {"MCMXCVIII", 1998},
                {"MMDCCLI", 2751}
        });
    }

    private String roman;
    private int expectedArabic;

    public RomanToArabicConverterTest(String roman, int expectedArabic) {
        this.roman = roman;
        this.expectedArabic = expectedArabic;
    }

    @Test
    public void testRomanToArabicConversion() {
        assertThat(RomanNumeralsConverter.convertRomanToArabic(roman)).as("Roman numeral => " + roman).isEqualTo(expectedArabic);
    }
}
