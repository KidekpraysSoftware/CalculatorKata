package com.kidek;

public class NumberDictionary {

    public static int decoding(String Number) {

        return switch (Number) {
            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            //кодируем римские цифры
            case "I" -> 101;
            case "II" -> 102;
            case "III" -> 103;
            case "IV" -> 104;
            case "V" -> 105;
            case "VI" -> 106;
            case "VII" -> 107;
            case "VIII" -> 108;
            case "IX" -> 109;
            case "X" -> 110;
            default -> 0; //любой неподходящий аргумент

        };

    }

    public static String RomanNumerals(int Number) {

        return switch (Number) {
            case 0 -> "nulla";
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            case 11 -> "XI";
            case 12 -> "XII";
            case 13 -> "XIII";
            case 14 -> "XIV";
            case 15 -> "XV";
            case 16 -> "XVI";
            case 17 -> "XVI";
            case 18 -> "XVIII";
            case 19 -> "XIX";
            case 20 -> "XX";
            case 21 -> "XXI";
            case 22 -> "XXII";
            case 23 -> "XXIII";
            case 24 -> "XXIV";
            case 25 -> "XXV";
            case 26 -> "XXVI";
            case 27 -> "XXVII";
            case 28 -> "XXVIII";
            case 29 -> "XXIX";
            case 30 -> "XXX";
            case 31 -> "XXXI";
            case 32 -> "XXXII";
            case 33 -> "XXXIII";
            case 34 -> "XXXIV";
            case 35 -> "XXXV";
            case 36 -> "XXXVI";
            case 37 -> "XXXVII";
            case 38 -> "XXXVIII";
            case 39 -> "XXXIX";
            case 40 -> "XL";
            case 41 -> "XLI";
            case 42 -> "XLII";
            case 43 -> "XLIII";
            case 44 -> "XLIV";
            case 45 -> "XLV";
            case 46 -> "XLVI";
            case 47 -> "XLVII";
            case 48 -> "XLVIII";
            case 49 -> "XLIX";
            case 50 -> "L";
            case 51 -> "LI";
            case 52 -> "LII";
            case 53 -> "LIII";
            case 54 -> "LIV";
            case 55 -> "LV";
            case 56 -> "LVI";
            case 57 -> "LVII";
            case 58 -> "LVIII";
            case 59 -> "LIX";
            case 60 -> "LX";
            case 61 -> "LXI";
            case 62 -> "LXII";
            case 63 -> "LXIII";
            case 64 -> "LXIV";
            case 65 -> "LXV";
            case 66 -> "LXVI";
            case 67 -> "LXVII";
            case 68 -> "LXIII";
            case 69 -> "LXIX";
            case 70 -> "LXX";
            case 71 -> "LXXI";
            case 72 -> "LXXII";
            case 73 -> "LXXIII";
            case 74 -> "LXXIV";
            case 75 -> "LXXV";
            case 76 -> "LXXVI";
            case 77 -> "LXXVII";
            case 78 -> "LXXVIII";
            case 79 -> "LXXIX";
            case 80 -> "LXXX";
            case 81 -> "LXXXI";
            case 82 -> "LXXXII";
            case 83 -> "LXXXIII";
            case 84 -> "LXXXIV";
            case 85 -> "LXXXV";
            case 86 -> "LXXXVI";
            case 87 -> "LXXXVII";
            case 88 -> "LXXXVIII";
            case 89 -> "LXXXIX";
            case 90 -> "XC";
            case 91 -> "XCI";
            case 92 -> "XCII";
            case 93 -> "XCIII";
            case 94 -> "XCIV";
            case 95 -> "XCV";
            case 96 -> "XCVI";
            case 97 -> "XCVII";
            case 98 -> "XCVIII";
            case 99 -> "XCIX";
            case 100 -> "C";
            default -> "0";
        };
    } //переводит арабские числа в римские в диапазоне 0-100
}
