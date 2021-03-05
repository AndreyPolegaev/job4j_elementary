package ru.job4j.condition;

public class MultiMax {
    public static int max(int firs, int second, int third) {
        int rsl = 0;
        if (firs > second) {
            rsl = firs;
        } else {
            rsl = second;
        }
        if (rsl > third) {
            return rsl;
        } else {
            return third;
        }
    }

        public static void main(String[] args) {
            System.out.println(max(10, 5, 3));
            System.out.println(max(1, 5, 3));
            System.out.println(max(1, 5, 15));
            System.out.println(max(1, 1, 1));
        }
}
