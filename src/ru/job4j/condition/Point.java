package ru.job4j.condition;

public class Point {
    public static double distance(int x2, int x1, int y2, int y1) {
        double rsl = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = distance(2, 1, 6, 3);
        double result2 = distance(3, 1, 10, 5);
        System.out.println("result (2, 1) to (6, 3)= " + result);
        System.out.println("result (3, 1) to (10, 5)= " + result2);
    }
}
