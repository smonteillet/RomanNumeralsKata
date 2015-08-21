package fr.smo.romannumerals;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry;

/**
 * Created by monteillet on 21/08/2015.
 */
public class Arabic {

    public static String convertToRoman(int arabic) {
        validate(arabic);
        StringBuilder roman = new StringBuilder();
        while (arabic > 0) {
            Entry<Integer, String> entry = getEntry(arabic);
            roman.append(entry.getValue());
            arabic -= entry.getKey();
        }
        return roman.toString();
    }

    private static void validate(int arabic) {
        if (arabic < 1 || arabic > 4999) {
            throw new IllegalArgumentException("Arabic number shall be between 1 and 4999");
        }
    }

    /**
     * Shall return the entry from the getArabic() method where the key (corresponding to an Arabic number) is <= to the given arabic number.
     *
     * @param arabic
     * @return
     */
    private static Entry<Integer, String> getEntry(int arabic) {
        Entry<Integer, String>[] entryArray = getArabicEntrySet();
        Entry<Integer, String> result = entryArray[entryArray.length - 1];
        for (int i = 0; i < entryArray.length - 1; i++) {
            if (entryArray[i].getKey() <= arabic && entryArray[i + 1].getKey() > arabic) {
                result = entryArray[i];
            }
        }
        return result;
    }

    private static Entry<Integer, String>[] getArabicEntrySet() {
        Entry<Integer, String>[] entrySetArray = new Entry[getArabic().size()];
        int cpt = 0;
        for (Entry<Integer, String> entry : getArabic().entrySet()) {
            entrySetArray[cpt++] = entry;
        }
        return entrySetArray;
    }

    private static Map<Integer, String> getArabic() {
        Map<Integer, String> romansMap = new LinkedHashMap<>();
        romansMap.put(1, "I");
        romansMap.put(4, "IV");
        romansMap.put(5, "V");
        romansMap.put(9, "IX");
        romansMap.put(10, "X");
        romansMap.put(40, "XL");
        romansMap.put(50, "L");
        romansMap.put(90, "XC");
        romansMap.put(100, "C");
        romansMap.put(400, "CD");
        romansMap.put(500, "D");
        romansMap.put(900, "CM");
        romansMap.put(1000, "M");
        return romansMap;
    }
}
