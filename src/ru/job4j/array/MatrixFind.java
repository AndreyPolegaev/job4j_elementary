package ru.job4j.array;
/**
 * Поиск byltrcf элемента в 2-мерном массиве
 */
public class MatrixFind {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] == 6) {
                    System.out.println("Индекс= " + row + " " + cell);
                }
            }
        }
    }
}
