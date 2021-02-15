package ru.job4j.array;
// Поиск индекса элемента в массиве
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
    /*
    Поиск индекса элемента в диапазоне. data - массив чисел,  el - искомый элемент, start - индекс, с которого начинаем поиск,

    finish - индекс, которым заканчиваем поиск.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rsl = i;
            }
        }
        return  rsl;
    }
}
