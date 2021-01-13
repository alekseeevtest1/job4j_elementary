package ru.job4j.arrays;

/**
 * Метод принимает два массива символов. В цикле for вам нужно сравнить значения ячеек с одинаковым индексом.
 * Если все ячейки из массива pref соответствуют таким же ячейкам в массиве word, значит, нужно вернуть true.
 *
 * Если хотя бы один элемент отличается, значит, слово word не начинается со слова pref.
 */

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int a = 0;
        if(word.length > pref.length){
            a = pref.length;
        } else {
            a = word.length;
        }
        for (int i = 0; i < a; i++) {
            if(word[i] != pref[i]){
                result = false;
            }
        }

        return result;
    }
}