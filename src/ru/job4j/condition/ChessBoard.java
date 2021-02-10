package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        } else {
            return 0;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(1, 3, 4, 0));
        System.out.println(way(6, 7, 1, 2));
        System.out.println(way(5, 0, 1, 0)); // не по диагонали -> 0
    }
}
