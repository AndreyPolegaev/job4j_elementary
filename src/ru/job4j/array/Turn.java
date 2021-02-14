package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0, j = array.length; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
