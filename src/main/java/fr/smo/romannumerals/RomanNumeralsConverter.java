package fr.smo.romannumerals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by monteillet on 21/08/2015.
 */
public class RomanNumeralsConverter {

    private static final Map<String, Integer> romanToArabic;
    private static final Map<String, Integer> romanToArabicSubstractRule;

    static {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        romanToArabic = Collections.unmodifiableMap(map);

        Map<String, Integer> mapSubstract = new HashMap<>();
        mapSubstract.put("IV", 4);
        mapSubstract.put("IX", 9);
        mapSubstract.put("XL", 40);
        mapSubstract.put("XC", 90);
        mapSubstract.put("CD", 400);
        mapSubstract.put("CM", 900);
        romanToArabicSubstractRule = Collections.unmodifiableMap(mapSubstract);
    }


    public static int convertRomanToArabic(String roman) {
        roman = roman.trim();
        performCheck(roman);
        int arabic = 0;
        int length = roman.length();
        char[] romanCharArray = roman.toCharArray();
        int i = 0;
        while (i <= length - 1) {
            String currentRomanNumeral = romanCharArray[i] + "";
            if (i + 1 <= length - 1) {
                String currentRomanNumeralWithSubtract = currentRomanNumeral + romanCharArray[i + 1];
                Integer number = romanToArabicSubstractRule.get(currentRomanNumeralWithSubtract);
                if (number != null) {
                    arabic += number;
                    i++;
                } else {
                    arabic += romanToArabic.get(currentRomanNumeral);
                }
            } else {
                arabic += romanToArabic.get(currentRomanNumeral);
            }
            i++;
        }
        return arabic;
    }

    private static void performCheck(String roman) {
        for (char c : roman.toCharArray()) {
            if (romanToArabic.get(c + "") == null) {
                throw new IllegalArgumentException("Following character is not allowed: "+c);
            }
        }
    }
}
