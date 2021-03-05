package ru.job4j.sort;
import java.util.Arrays;
/**
Жадный алгоритм.
У вас есть купюра 50 или 100 рублей. Вы хотите купить кофе за 35 рублей. Если вы засунули 50 рублей, то автомат должен
вернут 15 рублей (монетами 10, 5, 2, 1).
Автомат может вернуть только монеты.
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
            for (int i = 0; i < coins.length; i++) {
                while (money >= coins[i]) {
                    money -= coins[i];
                    rsl[size++] = coins[i];
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
