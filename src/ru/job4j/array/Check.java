package ru.job4j.array;
/**
Проверка однородности массива boolean[]. {true, true, true} ->true. {false, true, true} -> false
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                rsl = false;
                break;
            }
        }
       return rsl;
    }
}
