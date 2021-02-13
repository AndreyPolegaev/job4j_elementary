package ru.job4j.live;
// метод принимает 3 параметра, 3-1 пар. -э то результат арифм операций над 1 и 2 -м.
public class MathOperations {
    public static String selectAction(int left, int right, int rsl) {
        String result = "none";

        if ((left + right) == rsl) {
            result = "added";
        } else if ((left - right) == rsl) {
            result = "subtracted";
        } else if ((left * right) == rsl) {
            result = "multiplied";
        } else if ((left / right) == rsl) {
            result = "divided";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(selectAction(10, 5, 15));
    }
}
