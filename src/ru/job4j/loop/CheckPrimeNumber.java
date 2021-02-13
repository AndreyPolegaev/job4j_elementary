package ru.job4j.loop;
// если number простое число (делится на себя и на 1) вернуть true

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
