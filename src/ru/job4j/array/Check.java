package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                rsl = false;
            }
        }
       return rsl;
    }
}
