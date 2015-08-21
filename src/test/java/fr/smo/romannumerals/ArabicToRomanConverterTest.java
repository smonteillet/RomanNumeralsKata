package fr.smo.romannumerals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by monteillet on 21/08/2015.
 */
@RunWith(Parameterized.class)
public class ArabicToRomanConverterTest  extends AbstractTest{

    private String roman;
    private int arabic;

    public ArabicToRomanConverterTest(String roman, int arabic) {
        this.roman = roman;
        this.arabic = arabic;
    }

    @Test
    public void testRomanToArabicConversion() {
        assertThat(Arabic.convertToRoman(arabic)).as("Arabic=> " + arabic).isEqualTo(roman);
    }
}
