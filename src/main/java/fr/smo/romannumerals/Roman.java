package fr.smo.romannumerals;

import java.util.HashMap;
import java.util.Map;

public class Roman {

    private static final Map<String, Integer> romans = getRomans();

    public static int convertToArabic(String roman) {
        roman = roman.trim();
        validate(roman);
        int arabic = 0;
        int romanLength = roman.length();
        for (int cursor = 0; cursor < romanLength; cursor++) {
            int firstValue = romans.get(roman.substring(cursor, cursor + 1));
            int secondValue = (romanLength <= cursor + 1) ? 0 : romans.get(roman.substring(cursor + 1, cursor + 2));
            arabic += (firstValue >= secondValue) ? firstValue : (firstValue * -1);
        }
        return arabic;
    }

    private static void validate(String roman) {
        //TODO
    }

    private static Map<String, Integer> getRomans() {
        Map<String, Integer> romansMap = new HashMap<>();
        romansMap.put("I", 1);
        romansMap.put("V", 5);
        romansMap.put("X", 10);
        romansMap.put("L", 50);
        romansMap.put("C", 100);
        romansMap.put("D", 500);
        romansMap.put("M", 1000);
        return romansMap;
    }
}
