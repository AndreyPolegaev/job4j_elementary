package ru.job4j.array;
/**
 * Поиск минимального элемента в массиве
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
