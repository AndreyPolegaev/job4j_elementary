package ru.job4j.condition;

public class SqArea {
    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, \nArea= " + result1);
    }

    static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = k * h;
        double rsl = l * h;
        return rsl;
    }

}
