package com.homework.homework5;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 */
public class StringTask1 {

    public static void main(String[] args) {
        String inputValue = "abc Cpddd Dio OsfWw";

        String noSpacesUpperCaseValue = removeSpaces(inputValue).toUpperCase();
        String noDuplicatesValue = removeDuplicates(noSpacesUpperCaseValue);
        System.out.println(inputValue);
        System.out.println(noSpacesUpperCaseValue);
        System.out.println(noDuplicatesValue);
    }

    private static String removeSpaces(String value) {
        return value.replaceAll("\\s+","");
    }

    private static String removeDuplicates(String value) {
        return value.replaceAll("(.)\\1{1,}", "$1");
    }
}
