package ru.job4j.array;
/*
Метод принимает два массива символов.
Если все ячейки из массива pref соответствуют таким же ячейкам в массиве word, значит, нужно вернуть true.
Если хотя бы один элемент отличается, значит, слово word не начинается со слова pref.
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
