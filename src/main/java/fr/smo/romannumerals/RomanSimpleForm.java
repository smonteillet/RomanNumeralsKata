package fr.smo.romannumerals;

/**
 * Created by monteillet on 21/08/2015.
 */
public enum RomanSimpleForm {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private int arabicValue;

    private RomanSimpleForm(int arabicValue) {
        this.arabicValue = arabicValue;
    }

    public int getArabicValue() {
        return arabicValue;
    }

    public static RomanSimpleForm get(String roman) {
        for (RomanSimpleForm r : RomanSimpleForm.values()) {
            if (r.toString().equals(roman)) {
                return r;
            }
        }
        return null;
    }
}
