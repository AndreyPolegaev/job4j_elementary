package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int i = 0; i < data.length; i++) {
           if (data[i] == data[0]) {
               continue;
           } else {
              rsl = false;
             }
        }
        return rsl;
    }
}
