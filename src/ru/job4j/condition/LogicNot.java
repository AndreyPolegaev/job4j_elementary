package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return (!isEven(num) && isPositive(num));
    }

    public boolean evenOrNotPositive(int num) {
        return (isEven(num) || !isPositive(num));
    }

    public static void main(String[] args) {
        LogicNot lg = new LogicNot();
        System.out.println("4 -  Число четное? " + lg.isEven(4));
        System.out.println("10 - Число положительное? " + lg.isPositive(10));
        System.out.println("9 -  Число нечетное? " + lg.notEven(9));
        System.out.println("-5 Число не положительное? " + lg.notPositive(-5));
        System.out.println("7 не четное и положительное? " + lg.notEvenAndPositive(7));
        System.out.println("-10 или четное или не положительное " + lg.evenOrNotPositive(-10));
        System.out.println("20  или четное или не положительное " + lg.evenOrNotPositive(20));
    }
}
