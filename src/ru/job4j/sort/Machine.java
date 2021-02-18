package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        while (money > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (money >= coins[i]) {
                    money -= coins[i];
                    rsl[size] = coins[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
