package fr.smo.romannumerals;

/**
 * Created by monteillet on 21/08/2015.
 */
public class RomanNumeral {

    private String romanNumeral;

    public RomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral.trim();
    }


    public int convertToArabic() {
        validate();
        int arabic = 0;
        String[] split = split();
        int romanNumeralLength = romanNumeral.length();
        int cursor = 0;
        while (cursor <= romanNumeralLength - 1) {
            String currentNumeral = split[cursor];
            if (!isNextCursorMoveWillBeAtTheEnd(cursor)) {
                String nextNumeral = split[cursor + 1];
                RomanSubstractiveNotationForm value = RomanSubstractiveNotationForm.get(currentNumeral + nextNumeral);
                if (value == null) {
                    arabic += RomanSimpleForm.get(currentNumeral).getArabicValue();
                } else {
                    arabic += value.getArabicValue();
                    cursor++;
                }
            } else {
                arabic += RomanSimpleForm.get(currentNumeral).getArabicValue();
            }
            cursor++;
        }
        return arabic;
    }


    private boolean isNextCursorMoveWillBeAtTheEnd(int cursor) {
        return cursor + 1 > romanNumeral.length() - 1;
    }

    private void validate() {
        RomanNumeralValidator.validate(this);
    }

    String[] split() {
        String[] results = new String[romanNumeral.length()];
        int cpt = 0;
        for (char c : romanNumeral.toCharArray()) {
            results[cpt++] = c + "";
        }
        return results;
    }

}
