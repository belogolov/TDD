package ru.my.pet.project;

public class RomanNumerator {
    public static String toRoman(int arabic) {
        int copyArabic = arabic;
        String result = "";

        while (copyArabic > 0) {
            if (copyArabic >= 5) {
                result += "V";
                copyArabic -= 5;
            }
            if (copyArabic >= 4) {
                result += "IV";
                copyArabic -= 4;
            }
            if (copyArabic > 0) {
                result += "I";
                copyArabic--;
            }
        }

        return result;
    }
}
