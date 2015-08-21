package fr.smo.romannumerals;

/**
 * Created by monteillet on 21/08/2015.
 */
public enum RomanSubstractiveNotationForm {

    IV(4), IX(9), XL(40), XC(90), CD(400), CM(900);

    private int arabicValue;

    private RomanSubstractiveNotationForm(int arabicValue) {
        this.arabicValue = arabicValue;
    }

    public static RomanSubstractiveNotationForm get(String roman) {
        for (RomanSubstractiveNotationForm entry : RomanSubstractiveNotationForm.values()) {
            if (entry.toString().equals(roman)) {
                return entry;
            }
        }
        return null;
    }

    public int getArabicValue() {
        return arabicValue;
    }
}
