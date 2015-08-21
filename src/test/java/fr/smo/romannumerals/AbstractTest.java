package fr.smo.romannumerals;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by monteillet on 21/08/2015.
 */
public class AbstractTest {

    @Parameterized.Parameters
    public static Collection<Object[]> dataset() {
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
                {"CCCLXIX", 369},
                {"CD", 400},
                {"CDXLVIII", 448},
                {"DCCCLXXXVIII", 888},
                {"M", 1000},
                {"MCMXCVIII", 1998},
                {"MMM",3000},
                {"MMDCCLI", 2751}
        });
    }
}
