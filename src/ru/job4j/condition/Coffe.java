package ru.job4j.condition;
/*
Акция на кофе: посетитель купил count чашек кофе, от n кол-ва кофе действует акция + 1 чашка бесплатно за каждые n штук.
Например купил 12 чашек, получил всего 14 чашек кофе.
 */

public class Coffe {
    public static int countCup(int count, int n) {
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        if (count < n) {
            sum = count;
        }
        if (count == n) {
            sum2 = count + 1;
        }
        if (count > n) {
            sum3 = count + (count / n);
        }

        return sum + sum2 + sum3;
    }

    public static void main(String[] args) {
        System.out.println(countCup(7, 6));
        System.out.println(countCup(213, 6));
        System.out.println(countCup(12, 6));
    }
}