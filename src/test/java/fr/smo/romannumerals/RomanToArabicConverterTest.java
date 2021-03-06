package fr.smo.romannumerals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class RomanToArabicConverterTest extends AbstractTest {


    private String roman;
    private int arabic;

    public RomanToArabicConverterTest(String roman, int arabic) {
        this.roman = roman;
        this.arabic = arabic;
    }

    @Test
    public void testRomanToArabicConversion() {
        assertThat(Roman.convertToArabic(roman)).as("Roman numeral => " + roman).isEqualTo(arabic);
    }
}
