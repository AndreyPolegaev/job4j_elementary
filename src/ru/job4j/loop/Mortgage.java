package ru.job4j.loop;
/*
Метод должен вычислять количество лет, необходимых для погашения кредита.
использовать цикл while: в теле цикла произвести вычисление кредитной суммы за год плюс остатка.
amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
 */
public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + (amount * percent); // долг за 1 год
            amount = amount - salary; // остаток через год
            year++;
        }
        return  year;
    }
}