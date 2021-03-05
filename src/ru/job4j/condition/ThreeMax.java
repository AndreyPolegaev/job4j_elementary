package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
    int result = first;
    if (second >= first && second >= third) {
        result = second;
    }
    if (third >= first && third >= second) {
        result = third;
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
        System.out.println(max(1, 100, 100));
        System.out.println(max(100, 1, 100));
        System.out.println(max(100, 100, 1));
        System.out.println(max(10, -5, 40));
    }
}