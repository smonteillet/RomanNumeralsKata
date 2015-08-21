package fr.smo.romannumerals;

/**
 * Created by monteillet on 21/08/2015.
 */
public class RomanNumeralValidator {

    /**
     * Check if a RomanSimpleForm numeral is valid.
     *
     * @param roman the roman numeral to check
     * @throws IllegalArgumentException if the roman numeral is not valid.
     */
    public static void validate(RomanNumeral roman) throws IllegalArgumentException {
        checkAllNumeralsAreRoman(roman);
        checkAllSubstractiveNotationAreOk(roman);
    }

    /**
     * Check that all Subtractive notation inside a roman numeral are OK. For example, IC is not valid. It could have been 99, but 99 is XCIX.
     *
     * @param roman
     * @throws IllegalArgumentException
     */
    private static void checkAllSubstractiveNotationAreOk(RomanNumeral roman) throws IllegalArgumentException {
        //TODO
    }

    /**
     * Check if all numbers are RomanSimpleForm.
     *
     * @param roman the roman numeral to check
     * @throws IllegalArgumentException if at least one roman numeral is not valid
     */
    private static void checkAllNumeralsAreRoman(RomanNumeral roman) {
        for (String s : roman.split()) {
            if (RomanSimpleForm.get(s) == null) {
                throw new IllegalArgumentException("Following character is not allowed: " + s);
            }
        }
    }
}
