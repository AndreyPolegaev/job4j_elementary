package ru.job4j.array;
// Прямой проход по массиву
public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - 1 - i] + " ");
        }
        System.out.println();
        // вывести прямым проходом по массиву элементы с четными индексами начиная с конца массива
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                System.out.print(numbers[numbers.length - 1 - i] + " ");
            }
        }
    }
}
